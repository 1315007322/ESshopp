package com.yhf.eshop.common.until;

import com.alibaba.fastjson.JSON;
import com.yhf.eshop.common.entity.Entity;

import java.util.ArrayList;
import java.util.List;

/*
* JSON工具类
* 用来处理json的相关类容
* */
public class JSONUntil {
    public static void main(String[] args) {
        Entity entity = new Entity();
        entity.setId("1");
        entity.setCreateTime("2020-12-5");
        String json = entity2JSON(entity);
        System.out.println(json); //{"createTime":"2020-12-5","id":"1","idDel":"1"}
        System.out.println("---------------");

        Entity entity1 = new Entity();
        entity1.setId("1");
        entity1.setCreateTime("2020-12-5");
        List<Entity> entityList = new ArrayList<>();
        entityList.add(entity);
        entityList.add(entity1);
        System.out.println(entity2JSON(entityList));

        System.out.println("---------------");
        String entityJson = new String();
        entityJson = "{\"createTime\":\"2020-12-5\",\"id\":\"1\",\"idDel\":\"3\"}";
        Object obj = json2Entity(entityJson,Entity.class);
        Entity e = (Entity)obj ;
        System.out.println(e.getId());

        System.out.println("----------------");

        String entityJsonList = new String();
        entityJsonList = "[{\"createTime\":\"2020-12-5\",\"id\":\"4\",\"idDel\":\"1\"},{\"createTime\":\"2020-12-5\",\"id\":\"5\",\"idDel\":\"5\"}]";
        List<Entity> obj2 = json2EntityList(entityJsonList,Entity.class);
        System.out.println("id:" + obj2.get(0).getId());
        System.out.println("id:" + obj2.get(1).getId());
    }
    /**
    * 把对象转为 json格式的字符串
     * ? 泛型的通配符：代表未知的任意类型，或者说 是Object
    * @param entity 指定对象
    * @return 返回json格式的字符串
    * */
    public static String entity2JSON(Object entity){
        return JSON.toJSONString(entity);
    }

    /**
     * 把对象列表转为 json格式的字符串
     * @param entityList 指定对象
     * @return 返回json格式的字符串
     * */
    public static String entityList2JSON(List<?> entityList){
        return entity2JSON(entityList);
    }

    /**
     * 把 json数据转换为指定类型对象Object
     * @param json 要转换的json 数据
     * @param clazz 指定的 对象类型
     * @param <T> 指定的类型
     * @return 返回指定类型的对象Object
     * */
    public static <T>T json2Entity(String json,Class<T> clazz){
        return JSON.parseObject(json,clazz);
    }


    /**
     * 把 json数组转换为指定类型对象Object列表
     * @param json 要转换的json 数据
     * @param clazz 指定的 对象类型
     * @return 返回指定类型的对象Object
     * */
    public static <T> List <T> json2EntityList(String json,Class<T> clazz){
        return JSON.parseArray(json,clazz);
    }


}
