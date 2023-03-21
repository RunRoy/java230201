package exe;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.Arrays;
import java.util.zip.ZipEntry;

/**
 * @author lystart
 * @create 2023-02-08 15:51
 */
public class Exe5 {
    public static void main(String[] args) {
        /*
        英语中最长的单词是"pneumonoultramicroscopicsilicovolcanoconiosis"，意思是“肺尘病，矽肺病”
        一共有45个英文字母。现在要求统计这个单词中出现了哪些字母，以及它们出现的次数，并且找出出现次数最多的字母。


            其中toCharArray()是String类型提供的系统函数，就像Math.random()等函数一样，后面会学到，这里先提前用一下。
            它的作用就是创建一个char[]数组，并把字符串中的每一个字符依次存储到这个char[]数组中。

            counts[0]记录的是'a'字母的次数，counts[1]记录的是'b'字母的次数，依次类推。
         */

        //（1）使用String类型的变量word存储英语单词"pneumonoultramicroscopicsilicovolcanoconiosis"
        String word = "pneumonoultramicroscopicsilicovolcanoconiosis";

        //（2）通过word.toCharArray()可以根据字符串word得到一个char[]类型的数组。
        //（3）声明一个int类型的数组counts，长度为26，分别用来记录26个字母出现的次数，
        char[] chars = word.toCharArray();
        int[] counts = new int[26];
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 97]++;
        }
        int max = counts[0];
        for (int i = 0; i < counts.length; i++) {
            if (max < counts[i]) {
                max = counts[i];
            }
        }
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println();
            } else {
                System.out.print((char) (i + 'a') + "出现的次数" + counts[i] + "\t");
            }
        }
        for (int i = 0; i < counts.length; i++) {
            if (max == counts[i]) {
                System.out.println("出现次数最多的字母" + (char) (i + 97));
            }
        }
    }
}
