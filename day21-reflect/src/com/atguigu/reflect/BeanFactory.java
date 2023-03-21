package com.atguigu.reflect;

import java.lang.reflect.Field;
import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * 包名:com.atguigu.reflect
 *
 * @author Leevi
 * 日期2023-03-01  10:08
 */
public class BeanFactory<T> {
    public T getBean(Class<T> clazz) throws InstantiationException, IllegalAccessException {
        return clazz.newInstance();
    }

    public Object getBean() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //1. 读取配置文件(properties)
        ResourceBundle resourceBundle = ResourceBundle.getBundle("application");
        //1.1 获取要创建的对象的类的全限定名
        String className = resourceBundle.getString("bean.className");
        //1.2 获取Class对象
        Class<?> clazz = Class.forName(className);
        //1.3 创建对象
        Object obj = clazz.newInstance();
        //1.4 获取需要赋值的那些属性
        Enumeration<String> keys = resourceBundle.getKeys();
        //1.5 遍历出每一个key
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();

            if (key.equals("bean.className")) {
                continue;
            }
            //去掉key的前缀
            String fieldName = key.substring(key.lastIndexOf(".") + 1);
            //给属性赋值
            //获取field对象
            Field declaredField = clazz.getDeclaredField(fieldName);

            //暴力反射
            declaredField.setAccessible(true);

            //从配置文件中获取要赋的值
            String value = resourceBundle.getString(key);

            //获取属性的类型
            if (declaredField.getType() == int.class) {
                declaredField.setInt(obj,Integer.parseInt(value));
            }else if (declaredField.getType() == double.class){
                declaredField.setDouble(obj,Double.parseDouble(value));
            }else {
                //????我想干啥 给对象的字段赋值
                declaredField.set(obj,value);
            }
        }
        return obj;
    }
}
