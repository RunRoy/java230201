import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = input.nextInt();

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("可以同时被3和5整除");
        }else{
            System.out.println("不能同时被3和5整除");
        }
    }
}
