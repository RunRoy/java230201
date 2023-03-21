import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        // 有三个班级，每个班级有四名学员，分别计算三个班级的平均分
        Scanner input = new Scanner(System.in);
        // 外层循环控制班级
        for (int i = 1; i <= 3 ; i++) {
            System.out.println("开始计算第"+i+"个班级的平均分");
            int sum = 0;
            // 内存循环控制学员成绩
            for (int j = 1; j <= 4 ; j++) {
                System.out.println("请输入第"+i+"个班级的第"+j+"名学员的成绩");
                int score = input.nextInt();
                sum += score;
            }
            int avg = sum / 4;
            System.out.println("第"+i+"个班级的平均分是："+avg);
        }

    }
}
