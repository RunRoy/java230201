import java.util.Scanner;

public class TestThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入分数");
        int score = input.nextInt();

        // 多重if-else结构必须以if结构开头
        // else结构为可选结构，else-if结构可以有任意多个，数量不受限制
        // 多重if-else结构从第一个if的条件开始判断
        // 如果条件判断为true，则对应执行该判断体，执行完毕则跳过剩余所有条件向下继续
        // 如果条件判断为false，则依次向下判断下一个判断条件
        if(score >= 0 && score <= 100) {
            if (score >= 90) {
                System.out.println("优秀");
            } else if (score >= 80) {
                System.out.println("好");
            } else if (score >= 70) {
                System.out.println("良");
            } else if (score >= 60) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }
        }else{
            System.out.println("分数必须在0-100之间");
        }
        System.out.println("------------------------------------------------");
        if(score >= 60 && score < 70){
            System.out.println("及格");
        }else if(score >= 80 && score < 90){
            System.out.println("好");
        }else if(score >= 70 && score < 80){
            System.out.println("良");
        }else if(score >= 90 && score <= 100){
            System.out.println("优秀");
        }else{
            System.out.println("不及格");
        }


    }
}
