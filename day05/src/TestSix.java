public class TestSix {
    public static void main(String[] args) {
        // 统计数组
        int[] nums = {74,92,56,83,27,61};
        int sum = 0;// 总和
        int avg = 0;// 均值
        int index = 0;// 偶数个数

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(nums[i] % 2 == 0){
                index++;
            }
        }

        avg = sum / nums.length;
        System.out.println("总和："+sum);
        System.out.println("均值："+avg);
        System.out.println("偶数个数："+index);
    }
}
