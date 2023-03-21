public class TestSeven {
    public static void main(String[] args) {
        // 1+2+3+4+5 …… +100 = 5050
        int sum = 0;// 总和
        int i = 1;// 循环变量
        // 先判断后执行的循环
        while(i <= 100){// 循环条件：循环条件为true进入循环体，循环条件为false结束循环
            // 循环操作(重复动作)
            sum = sum + i;
            // System.out.println(i);
            i++;// 循环变量的改变
        }
        System.out.println("sum="+sum);
    }
}
