package exe;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.Arrays;

/**
 * @author lystart
 * @create 2023-02-07 18:39
 */
public class Exe3 {
    public static void main(String[] args) {
        //要求使用char数组存储26个英文字母，并分别用正序和逆序方式显示输出。要求10个一行。
        char[] arr = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'g', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 'e', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            if ((i+1) % 10 == 0){
                System.out.println();
            }
        }
        int temp = 0;
        for (int l = 0,r = arr.length - 1 - l;l < r;l++,r--) {
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = (char) temp;
        }
        System.out.println("");
//        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
//            num++;
            if ((i +1) % 10 ==  0){
                System.out.println();
            }
        }
//        num = 0;
    }
}



