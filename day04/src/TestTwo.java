import java.util.Scanner;

public class TestTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个分数");
        int score = input.nextInt();
        if(score >= 0 && score <= 100){
            if(score >= 90){
                System.out.println("优秀");
            }else if(score >= 80){
                System.out.println("良好");
            }else if(score >= 60){
                System.out.println("及格");
            }else{
                System.out.println("不及格");
            }
        }else {
            System.out.println("请输入1-100之间的分数");
        }
        System.out.println("---------------------------------------------------");
        int choice = score / 10;
        switch (choice){
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 7:
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }
    }
}
