package com.atguigu.test1;

// 方法的递归调用
public class TestThree {
    public static void main(String[] args) {
        // methodOne();

//        int sum = getSum(1);
//        System.out.println("sum="+sum);

        /*
           使用递归去打印斐波那契额数列
           1 1 2 3 5 8 13 21 34 55 89 144
           1 2 3 4 5 6 7  8  9  10 11 12
         */
        // System.out.println(getFeiBo(8));
        for (int i = 1; i <= 12 ; i++) {
            System.out.print(getFeiBo(i)+"\t");
        }
    }

    public static void methodOne(){
        methodOne();
    }

    public static int getSum(int i){
        if(i == 100){
            return 100;
        }
        return i + getSum(i+1);
    }

    // 参数是当前斐波那契数列的数的位置，返回值是该位置处的数是多少
    public static int getFeiBo(int pos){
        if(pos == 1 || pos == 2){
            return 1;
        }
        return getFeiBo(pos - 2) + getFeiBo(pos - 1);
    }
}
