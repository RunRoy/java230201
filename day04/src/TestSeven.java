public class TestSeven {
    public static void main(String[] args) {
        // 1 1 2 3 5 8 13 21 34 55 89 144：斐波那契数列
        // a b c
        //   a b c
        //     a b c
        int i = 0;
        int a = 1;
        int b = 1;
        System.out.print(a+" "+b+" ");
        while(i < 10){
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
            i++;
        }
    }
}
