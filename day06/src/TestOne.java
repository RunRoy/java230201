public class TestOne {
    public static void main(String[] args) {
        int[] nums = {47,93,72,58,62};
        int target = 58;// 目标数据
        int index = -1;// 数据索引

        // 顺序查找
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("没有这个数");
        }else{
            System.out.println("找到这个数据了，下标是："+index);
        }
    }
}
