public class TestEight {
    public static void main(String[] args) {
        // 数组元素的顺序查找
        int[] nums = {74,92,56,83,127,61};
        int target = 127;
        int index = -1;// 搜索到元素后的元素下标
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("没有这个数字");
        }else{
            System.out.println("找到这个数字了，下标是："+index);
        }
    }
}
