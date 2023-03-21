public class TestThree {
    public static void main(String[] args) {
        // 二维数组
        // 二维数组的声明
        int[][] nums;// 推荐
        int nums1[][];// 不推荐
        int[] num2[];// 不推荐

        // 二维数组的初始化
        // 动态初始化
        nums = new int[10][3];// 同时给出一维和二维的长度
        nums1 = new int[10][];// 只给出一维长度不给二维长度

        nums[0][0] = 100;
        System.out.println(nums[0][0]);
        nums1[0] = new int[3];
        nums1[0][0] = 200;
        System.out.println(nums1[0][0]);
    }
}
