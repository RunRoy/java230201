package com.atguigu.stream;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 包名:com.atguigu.stream
 *
 * @author Leevi
 * 日期2023-03-03  11:04
 * 1. 创建Stream(Stream不存储任何元素,Stream的各种操作对原集合没有任何影响)
 *    1.1 Collection接口的stream()方法，这就是创建一个顺序流
 *    1.2 Collection接口的parallelStream()方法, 这就是创建一个并行流
 *    1.3 Arrays类的静态方法stream()
 *    1.4 Stream类的静态方法of()
 *    1.5 Stream类的静态方法generate()或者iterate()方法创建无限流
 * 2. Stream的中间操作(核心)
 *    2.1 filter(断言型接口)过滤
 *    2.2 distinct() 去重
 *    2.3 limit() 限制元素的个数
 *    2.4 skip() 跳过的元素个数
 *    2.5 sorted() 排序
 *    2.6 sorted(比较器) 按照指定比较器排序(自定义排序规则)
 *    2.7 map(功能型接口) 将旧元素映射成新元素
 * 3. Stream的终结操作(收尾)
 *    3.1  forEach(消费型接口): 使用消费型接口消费Stream处理之后的每一个元素
 *    3.2  collect(Collector接口): 收集
 *    3.3 allMatch(断言型接口): 判断Stream处理之后的所有元素是否都匹配某个条件
 *    3.4 anyMatch(断言型接口): 判断Stream处理之后的所有元素中是否有至少一个匹配某个条件
 *    3.5 noneMatch(断言型接口): 判断Stream处理之后的所有元素是否都不匹配某个条件
 *    3.6 findFirst(): 在Stream处理之后的所有元素中找出第一个
 *    3.7 findAny(): 在Stream处理之后的所有元素中任意找出一个
 *    3.8 count(): 获取在Stream处理之后的所有元素的总数量
 *    3.9 max(): 获取在Stream处理之后的所有元素的按照比较规则的最大值
 *    3.10 min(): 获取在Stream处理之后的所有元素的按照比较规则的最小值
 *    3.11 reduce(): 将元素进行两两结合
 */
public class StreamTest {
    @Test
    public void test03(){
        //学习Stream的中间操作
        //1. 构建一个集合
        List<Integer> list = Arrays.asList(1,1,1,2,2,3,4,4,6,6,5,5,7,7,8,8,9,10);
        //2. 使用Stream对其进行操作
        //目标: 获取集合中的最大值
        /*Optional<Integer> optional = list.stream()
                .reduce((n1, n2) -> n1 > n2 ? n1 : n2);*/

        //目标: 先去重再求集合的累加和
        Optional<Integer> optional = list.stream()
                .distinct()
                .reduce((n1, n2) -> n1 + n2);

        System.out.println(optional.get());
    }
    @Test
    public void test01(){
        //构建集合
        List<Integer> list = Arrays.asList(11,2,39,4,54,6,2,22,3,3,4,54,54);
        //各种需求:
        //1. 筛选大于20的元素
        //2. 对元素进行去重
        //3. 只取前两个元素
        Optional<Integer> optional = list.stream()
                .filter(item -> item > 20)
                .distinct()
                .skip(1)
                .findFirst();
        optional.ifPresent(System.out :: println);

    }

    @Test
    public void test02(){
        //创建Stream
        /*List<Integer> list = Stream.of(11, 2, 39, 4, 54, 6, 2, 22, 3, 3, 4, 54, 54)
                .filter(item -> item > 20)
                .distinct()
                .limit(2)
                .collect(Collectors.toList());

        System.out.println(list);*/

        //创建无限流
        Stream.generate(Math :: random)
                .forEach(System.out :: println);
    }

    @Test
    public void test04(){
        List<Hero> heroList = new ArrayList<>();
        heroList.add(new Hero("盖伦","德玛西亚","男"));
        heroList.add(new Hero("赵信","德玛西亚","男"));
        heroList.add(new Hero("光飞女郎拉克丝","德玛西亚","女"));
        heroList.add(new Hero("德莱厄斯","诺克萨斯","男"));
        heroList.add(new Hero("德莱文","诺克萨斯","男"));
        heroList.add(new Hero("卡特琳娜","诺克萨斯","女"));
        heroList.add(new Hero("菲欧娜","诺克萨斯","女"));
        heroList.add(new Hero("凯特琳","皮尔特沃夫","女"));
        heroList.add(new Hero("杰斯","皮尔特沃夫","男"));
        heroList.add(new Hero("楚雨荨","皮尔特沃夫","女"));

        //按照Hero的country进行分组，将相同国家的Hero放到一个Map里面(key是国家名，value是Hero的集合)
        //在按照country分分好的组里边，再按照sex分组
        Map<String, Map<String, List<Hero>>> map = heroList.stream()
                .collect(Collectors.groupingBy(Hero::getCountry, Collectors.groupingBy(Hero::getSex)));

        System.out.println(map);
    }

    @Test
    public void test05(){
        //第一支队伍
        ArrayList<String> one =new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");
        //第二支队伍
        ArrayList<String> two =new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");

        //1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
        //2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中。
        List<String> list1 = one.stream()
                .filter(item -> item.length() == 3)
                .limit(3)
                .collect(Collectors.toList());
        //3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中。
        //4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中。
        List<String> list2 = two.stream()
                .filter(item -> item.startsWith("张"))
                .skip(2)
                .collect(Collectors.toList());
        //5. 将两个队伍合并为一个队伍；存储到一个新集合中。
        List<String> list3 = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
        //6. 根据姓名创建 Person 对象；存储到一个新集合中。
        List<Person> list4 = list3.stream()
                .map(Person::new)
                .collect(Collectors.toList());
        //7. 打印整个队伍的Person对象信息

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
    }
}
