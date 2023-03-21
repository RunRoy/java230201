public class TestFive {
    public static void main(String[] args) {
        // switch-case结构
        int num = 7;
        // switch小括号中的变量用它值和case后面的常量值进行等值匹配
        // switch小括号中的变量类型必须和case后面的常量值的类型一致
        // switch小括号中的变量值从匹配的常量值case开始依次向下执行直到switch体末尾
        // switch小括号中的变量数据类型必须是byte，short，char，int
        // 从jdk1.5开始允许使用枚举，从jdk1.7开始允许使用String
        switch(num){
            // case的数量不受限制，case后面的常量值可以任意取值
            // 但不允许有case后面的常量值重复
            case 1:
                System.out.println("金牌");
                break;// 跳出switch结构
            case 2:
                System.out.println("银牌");
                break;
            case 3:
                System.out.println("铜牌");
                break;
            default:
                System.out.println("重在参与");
                break;
        }

    }
}
