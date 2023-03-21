import java.util.Arrays;

public class TestTwo {
    public static void main(String[] args) {
        // 冒泡排序
        int[] nums = {12,56,77,123,60,90};

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j] < nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
