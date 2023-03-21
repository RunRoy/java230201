import java.util.Arrays;

public class TestNine {
    public static void main(String[] args) {
        int[] nums = {74,92,56,83,127,61,81};
        Arrays.sort(nums);// 数组升序排列
        System.out.println(Arrays.toString(nums));
        // 二分查找
        int index = Arrays.binarySearch(nums,44);
        System.out.println(index);
    }
}
