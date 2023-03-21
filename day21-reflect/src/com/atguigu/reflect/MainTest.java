package com.atguigu.reflect;

import com.atguigu.bean.Dog;
import org.junit.Test;
import sun.util.resources.cldr.zh.TimeZoneNames_zh;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 包名:com.atguigu.reflect
 *
 * @author Leevi
 * 日期2023-03-01  10:10
 */
public class MainTest {
    @Test
    public void test01() throws InstantiationException, IllegalAccessException {
        //目标:使用BeanFactory创建Dog对象
        BeanFactory<Dog> beanFactory = new BeanFactory<>();

        Dog dog = beanFactory.getBean(Dog.class);
        dog.setName("小黄");
        dog.setColor("yellow");

        System.out.println(dog);
    }

    @Test
    public void test02(){
        //目标:Dog类到底由哪个类加载器负责加载
        //System.out.println(Dog.class.getClassLoader());

        //System.out.println(ClassLoader.getSystemClassLoader());

        //System.out.println(Test.class.getClassLoader());
        System.out.println(TimeZoneNames_zh.class.getClassLoader());
    }

    @Test
    public void test03() throws ClassNotFoundException {
        //怎么获取一个类的Class对象
        //1. 类名.class
        //Class<Dog> clazz = Dog.class;

        //2. Class.forName("类的全限定名");
        //Class<?> clazz = Class.forName("com.atguigu.bean.Dog");

        //3. 对象.getClass();
        //Dog dog = new Dog();
        //Class<? extends Dog> clazz = dog.getClass();
    }

    @Test
    public void test04() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //使用反射操作类的Constructor
        //目标1:使用反射调用Dog的无参构造创建Dog对象
        Class<Dog> clazz = Dog.class;
        //获取无参构造
        Constructor<Dog> constructor = clazz.getConstructor();
        //调用无参构造
        Dog dog = constructor.newInstance();
        System.out.println(dog);

        /*Dog dog = clazz.newInstance();
        System.out.println(dog);*/
    }

    @Test
    public void test05() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //目标2:使用反射调用Dog的有参构造创建Dog对象
        Class<Dog> clazz = Dog.class;

        Constructor<Dog> constructor = clazz.getConstructor(String.class,int.class);

        //使用构造创建对象
        Dog dog = constructor.newInstance("张三",20);
        System.out.println(dog);
    }

    @Test
    public void test06() throws InstantiationException, IllegalAccessException {
        //目标3:使用反射操作对象的属性
        //例如:创建Dog对象，并且给它的name，color、age属性进行赋值
        Class<Dog> clazz = Dog.class;
        //创建Dog对象
        Dog dog = clazz.newInstance();

        //操作对象的name、color、age属性
        //getFields()无法获取私有属性,但是能获取本类和父类的公有属性
        //Field[] fields = clazz.getFields();

        //getDeclaredFields无法获取父类的公有属性，只能获取本类中的公有和私有属性
        Field[] declaredFields = clazz.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            //获取属性名称
            String fieldName = declaredField.getName();
            //获取属性值
            Object value = declaredField.get(dog);

            //用反射修改字段的访问权限:暴力反射
            declaredField.setAccessible(true);

            //获取属性的类型
            Class<?> type = declaredField.getType();
            if (type == String.class && fieldName.equals("name")) {
                //设置属性值
                declaredField.set(dog,"张三");
            }

            if (type == String.class && fieldName.equals("color")) {
                //设置属性值
                declaredField.set(dog,"yellow");
            }

            if (type == int.class) {
                //设置属性值
                declaredField.set(dog,12);
            }
        }
        System.out.println(dog);
    }

    @Test
    public void test07() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //反射操作对象的方法
        //1. 获取字节码对象
        Class<Dog> clazz = Dog.class;
        //2. 创建对象
        Dog dog = clazz.newInstance();
        //3. 获取对象的方法
        Method method = clazz.getDeclaredMethod("eat",String.class);
        //4. 调用方法
        method.invoke(dog,"骨头");
    }

    @Test
    public void test08(){
        //反射还能干啥?
        Class<Dog> clazz = Dog.class;
        //获取当前类实现的所有接口
        //Class<?>[] interfaces = clazz.getInterfaces();
        //获取父类类型
        Class<? super Dog> superClazz = clazz.getSuperclass();
        //获取类的包名
        Package aPackage = clazz.getPackage();
        //获取类的修饰符
        int modifiers = clazz.getModifiers();
        //获取类名
        String typeName = clazz.getTypeName();
        System.out.println(typeName);
    }

    @Test
    public void test09() throws NoSuchFieldException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        BeanFactory beanFactory = new BeanFactory<>();
        Object bean = beanFactory.getBean();

        System.out.println(bean);
    }
}
