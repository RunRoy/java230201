public class TestOne {
    public static void main(String[] args) {
        for (int i = 1; i <= 5 ; i++) {
            for (int j = 1; j <= 5 - i ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i*2-1 ; j++) {
                if(i == 5){
                    if(j % 2 != 0) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else {
                    if (j == 1 || j == i * 2 - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
