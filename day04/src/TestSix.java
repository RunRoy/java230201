public class TestSix {
    public static void main(String[] args) {
        // 查找100-999之间的水仙花数，将其打印到控制台上
        // 153 = 1*1*1 + 5*5*5 + 3*3*3
        // num / 10 = 十位， num % 10 = 个位
        int i = 100;
        while(i <= 999){
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;

            int he = ge*ge*ge + shi*shi*shi + bai*bai*bai;

            if(he == i){
                System.out.println(i);
            }
            i++;
        }
    }
}
