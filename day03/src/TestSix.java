import java.util.Scanner;

public class TestSix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int month = input.nextInt();
        long begin = System.nanoTime();
        if(month == 1){
            System.out.println("冬季");
        }else if(month == 2){
            System.out.println("冬季");
        }else if(month == 3){
            System.out.println("春季");
        }else if(month == 4){
            System.out.println("春季");
        }else if(month == 5){
            System.out.println("春季");
        }else if(month == 6){
            System.out.println("夏季");
        }else if(month == 7){
            System.out.println("夏季");
        }else if(month == 8){
            System.out.println("夏季");
        }else if(month == 9){
            System.out.println("秋季");
        }else if(month == 10){
            System.out.println("秋季");
        }else if(month == 11){
            System.out.println("秋季");
        }else if(month == 12){
            System.out.println("冬季");
        }
//        switch (month){
//            case 1:
//                System.out.println("冬季");
//                break;
//            case 2:
//                System.out.println("冬季");
//                break;
//            case 3:
//                System.out.println("春季");
//                break;
//            case 4:
//                System.out.println("春季");
//                break;
//            case 5:
//                System.out.println("春季");
//                break;
//            case 6:
//                System.out.println("夏季");
//                break;
//            case 7:
//                System.out.println("夏季");
//                break;
//            case 8:
//                System.out.println("夏季");
//                break;
//            case 9:
//                System.out.println("秋季");
//                break;
//            case 10:
//                System.out.println("秋季");
//                break;
//            case 11:
//                System.out.println("秋季");
//                break;
//            case 12:
//                System.out.println("冬季");
//                break;
//        }
        long end = System.nanoTime();
        long result = end - begin;
        System.out.println(result);
    }
}
