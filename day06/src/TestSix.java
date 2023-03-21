public class TestSix {
    public static void main(String[] args) {
        // 杨辉三角形
        int[][] nums = new int[10][];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = new int[i+1];
            for (int j = 0; j < nums[i].length; j++) {
                if(j == 0 || j == nums[i].length - 1){
                    nums[i][j] = 1;
                }else{
                    nums[i][j] = nums[i-1][j] + nums[i-1][j-1];
                }
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
