package exe;


import java.util.Arrays;

/**
 * @author lystart
 * @create 2023-02-08 14:53
 */
public class Exe4 {
    public static void main(String[] args) {
        //判断某个数组是否是对称数组，即数组正序遍历和倒序遍历的结果是一样的。
        // 定义数组
        int[] arr = new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,};
        //定义boolean型变量
        boolean boo = true;
        // 循环遍历数组
        for (int i = 0; i < arr.length / 2; i++) {
            // 判断 数组前一般是否等于后一半，等于后一半说明该数组是对称数组
            // 不等于后半段则不是对称数组
            if(arr[i] == arr[arr.length -1  -i]){
            }else {
                boo = false;
                break;
            }
        }

    }
}
