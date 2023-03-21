import java.util.Scanner;

public class TestFour {
    public static void main(String[] args) {
        // 输入五个分数，计算总分和平均分
        Scanner input = new Scanner(System.in);

        int sum = 0;// 总分
        int avg = 0;// 平均分

        int i=1;
        while(i <= 5){
            System.out.println("请输入第"+i+"名学员的分数");
            int score = input.nextInt();
            sum += score;
            i++;
        }
        avg = sum / 5;
        System.out.println("总分："+sum);
        System.out.println("平均分："+avg);
    }
}
