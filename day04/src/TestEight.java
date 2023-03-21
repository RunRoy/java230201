import java.util.Scanner;

public class TestEight {
    public static void main(String[] args) {
        // 键盘输入一个单词，将这个单词输出到控制台，见到exit停止
        Scanner input = new Scanner(System.in);
//        System.out.println("请输入一个单词");
//        String word = input.next();
//
//        while(!word.equals("exit")){
//            System.out.println("当前输入的单词是："+word);
//            System.out.println("请输入一个单词");
//            word = input.next();
//        }
        // 先执行后判断，先执行一次循环操作，再判断循环条件，为true进入下一次循环，为false退出循环
        // 循环条件依赖循环操作时，考虑使用do-while循环
        String word;
        boolean flag = false;
        do{
            System.out.println("请输入一个单词");
            word = input.next();
            if(word.equals("exit")) {
                flag = true;
            }else{
                System.out.println("请输入单词是："+word);
            }
        }while(!flag);
    }
}
