public class TestSeven {
    public static void main(String[] args) {
        // 找最值
        int[] nums = {74,92,56,83,127,61};

        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }

        System.out.println(max);
    }
}
