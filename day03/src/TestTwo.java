import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int one;
        System.out.println("请输入一个分数");
        int score = input.nextInt();

        // if判断当结果为true时才会执行判断体代码
        // if判断当结果为false时会跳过判断体向下执行
//        if(score >= 90){
//            System.out.println("优秀");
//            one = 100;
//        }
        // if-else结构，条件为true则进行if结构，为false则进行else结构
        // 不同同时进行if和else结构，也不能if结构和else结构都不执行
//        if(score >= 90){
//            System.out.println("优秀");
//            one = 100;
//        }else{
//            System.out.println("不优秀");
//            one = 100;
//        }
        if(score >= 90){
            System.out.println("优秀");
            one = 100;
        }

        if(score < 90){
            System.out.println("不优秀");
            one = 100;
        }

//        System.out.println(one);
        input.close();
    }
}
