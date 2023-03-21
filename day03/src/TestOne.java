import java.util.Scanner;

public class TestOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int one = input.nextInt();
        // String s1 = input.next();// 遇到空格和回车都会返回字符串
        // String s2 = input.nextLine();// 遇到回车才会返回字符串
        System.out.println("请输入第二个整数");
        int two = input.nextInt();
        System.out.println(one >= two);
    }
}
