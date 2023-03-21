import java.util.Arrays;

public class Test10 {
    public static void main(String[] args) {
        // 数组元素的翻转
        int[] nums = {74,92,56,83,127,61,81};

        for (int i = 0,j = nums.length - 1; i < nums.length / 2; i++,j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }
}
