public class TestFour {
    public static void main(String[] args) {
        // 声明二维数组保存学员成绩
        int[][] scores = {
                {74,93,87,94,50},
                {83,95,67},
                {53,90,89,76,58,93}
        };

        // 遍历二维数组
        for (int i = 0; i < scores.length; i++) {
            System.out.println("开始计算第"+(i+1)+"个班级的平均分");
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            int avg = sum / scores[i].length;
            System.out.println("平均分是："+avg);
        }
    }
}
