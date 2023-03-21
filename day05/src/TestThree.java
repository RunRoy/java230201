public class TestThree {
    public static void main(String[] args) {
        // 一维数组的声明
        // 声明数组时，必须给出数组的数据类型和数组名
        int[] nums;// 推荐
        int nums1[];// 不推荐

        // 一维数组的初始化
        // 要求：数组必须在初始化时确定数组长度，且这个长度将不再改变(数组定长)
        // 动态初始化：根据给出的数组长度分配数组的内存空间
        // 动态初始化给出数组的存储空间，但不给数组元素赋有效值
        nums = new int[5];
        System.out.println(nums[0]);// 访问数组元素：数组名[下标]
        nums[0] = 100;
        System.out.println(nums[0]);
        nums[1] = 200;
        System.out.println(nums[1]);
        // 静态初始化
        int[] nums2 = {34,65,83,92,73};// 必须在一行之内完成
        nums1 = new int[]{76,88,90};// 可以一行完成也可以声明和初始化变成两行完成
    }
}
