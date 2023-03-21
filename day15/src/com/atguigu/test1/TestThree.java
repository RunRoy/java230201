package com.atguigu.test1;

public class TestThree {
    public static void main(String[] args) {
        String s = new String();
        System.out.println(s.isEmpty());// 判断字符串是否为空
        s = " hello world ";
        System.out.println(s.length());// 返回包含两端及中间空格的字符数
        s = s.trim();
        System.out.println(s.length());// 去除两端的空格

        System.out.println(s.contains("World"));// 在调用方法的字符串中查找参数字符串是否存在

        int index = s.indexOf("l");
        System.out.println(index);// 参数字符串在原串中第一次出现的索引
        int index1 = s.indexOf('l');
        System.out.println(index1);// 参数字符在原串中第一次出现的索引
        System.out.println(s.indexOf("l", index+1));// 从第二个参数开始搜索第一个参数字符串在原串中第一次出现的索引
        System.out.println(s.indexOf('l', index1 + 1));// 从第二个参数开始搜索第一个参数字符在原串中第一次出现的索引

        int index2 = s.lastIndexOf("l");// 返回参数字符串在原串中最后一次出现的索引
        System.out.println(index2);
        int index3 = s.lastIndexOf('l');// 返回参数字符在原串中最后一次出现的索引
        System.out.println(index3);
        int index4 = s.lastIndexOf("l",index2-1);// 从第二个参数开始搜索第一个参数字符串在原串中最后一次出现的索引
        System.out.println(index4);
        int index5 = s.lastIndexOf('l',index3-1);// 从第二个参数开始搜索第一个参数字符在原串中最后一次出现的索引

        String subStr = s.substring(6);// 从参数索引位置开始截取到字符串末尾
        System.out.println(subStr);
        String subStr1 = s.substring(0,5);// 从第一个参数索引位置开始截取到第二个参数索引位置的前一位
        System.out.println(subStr1);

        char c = s.charAt(6);// 返回指定索引位置的字符
        System.out.println(c);

        System.out.println(s.startsWith("hel"));// 判断原串是否以参数字符串开始
        System.out.println(s.endsWith("rld"));// 判断原串是否以参数字符串结尾

        System.out.println(s.replace('l','x'));// 将所有的旧字符替换成新字符
        System.out.println(s.replaceAll("l", "x"));// 将所有的旧字符串替换成新字符串
        System.out.println(s.replaceFirst("l", "x"));// 将第一个旧字符串替换成新字符串

        String word = "One|World|One|Dream";
        String[] words = word.split("\\|");// 使用参数作为分割点将原串分割成字符串数组
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }
}
