import java.util.Arrays;
import java.util.Scanner;

public class TestFour {
    public static void main(String[] args) {
        // 输入五名学员的分数，计算总分和平均分
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"学员的分数");
            nums[i] = input.nextInt();
        }
        int sum = 0;
        // System.out.println(Arrays.toString(nums));
        // length属性是数组的长度
        // 访问数组元素需要数组名[下标]，下标分合法下标和非法下标
        // 合法下标：0数组长度-1
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int avg = sum / nums.length;
        System.out.println("sum="+sum);
        System.out.println("avg="+avg);
    }
}
