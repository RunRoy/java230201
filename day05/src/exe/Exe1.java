package exe;


import java.time.Month;
import java.util.Scanner;

/**
 * @author lystart
 * @create 2023-02-07 18:09
 */
public class Exe1 {
    public static void main(String[] args) {
        //用一个数组，保存12个月的英语单词，从键盘输入1-12，显示对应的单词。
        Scanner input = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month = input.nextInt();
        String[] arr = new java.lang.String[]{"January","February","March","April","May","June","July","August","September","October","November","December"};
        if(month > 0 && month <= 12){
        for (int i = 0; i < arr.length; i++) {
            if (month - 1 == i) {
                System.out.println(arr[i]);
                 }
            }
        }else {
            System.out.println("输入不合法");
        }
    }
}

