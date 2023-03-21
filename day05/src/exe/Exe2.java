package exe;


import java.security.Key;
import java.util.Arrays;

/**
 * @author lystart
 * @create 2023-02-07 18:26
 */
public class Exe2 {
    public static void main(String[] args) {
        //遍历输出一副扑克牌。
        String[] hua = {"黑桃", "红桃", "梅花", "方片"};
        String[] dian = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] pu = new  String[hua.length * dian.length + 2];
        for (int i = 0, k = 0; i < hua.length; i++) {
            for (int j = 0; j < dian.length; j++,k++) {
                   pu[k] = hua[i] + dian[j];
            }
        }
        pu[pu.length -2] = "小王";
        pu[pu.length -1] = "大王";
        for (int i = 0; i < pu.length; i++) {
            System.out.print(pu[i] + "\t");
            if((i+1) % 13 == 0){
                System.out.println();
            }
        }
    }
}





