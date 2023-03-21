public class TestThree {
    public static void main(String[] args) {
        int sum = 0;
        int i = 2;
        // 先判断后执行
        while(i <= 100){// 循环条件
            // if(i % 2 == 0){
                sum += i;
            // }
            i+=2;// 循环变量的改变
        }
        System.out.println(sum);
    }
}
