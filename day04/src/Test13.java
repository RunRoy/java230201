import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        // 输入5个学员分数，判断有几个分数超过80分
        Scanner input = new Scanner(System.in);
        int index = 0;// 计数器
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入第"+i+"名学员的分数");
            int score = input.nextInt();
            if(score < 80){
                continue;// 结束本次循环，开始下一次循环
            }
            index++;
        }
        System.out.println(index);
    }
}
