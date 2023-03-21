public class TestFive {
    public static void main(String[] args) {
        int[][] nums = new int[5][];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = new int[i+1];
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = i+1;
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
}
