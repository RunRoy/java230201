import java.util.Scanner;

public class TestFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年");
        int year = input.nextInt();
        System.out.println("请输入月");
        int month = input.nextInt();

        if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("30天");
        }else if(month == 2){
            // 年能被4整除但不能被100整除，或者年能被400整除
            if((year % 4 == 0&&year % 100 != 0)||year % 400 == 0){
                System.out.println("29天");
            }else{
                System.out.println("28天");
            }
        }else{
            System.out.println("31天");
        }
    }
}
