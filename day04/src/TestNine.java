import java.util.Scanner;

public class TestNine {
    public static void main(String[] args) {
        // 输入密码和确认密码，两次密码一致则显示注册成功，两次密码不一致则继续输入
        Scanner input = new Scanner(System.in);
        String pwd;
        String pwdTwo;
        do{
            System.out.println("请输入密码");
            pwd = input.next();
            System.out.println("请输入确认密码");
            pwdTwo = input.next();
            if(!pwd.equals(pwdTwo)){
                System.out.println("两次密码不一致，请重新输入");
            }
        }while (!pwd.equals(pwdTwo));
        System.out.println("注册成功");
    }
}
