public class Test12 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            // 当i是多少的时候sum超过50
            sum += i;
            if (sum >= 50){
                System.out.println(i);
                break;// 提前结束循环
            }
        }

    }
}
