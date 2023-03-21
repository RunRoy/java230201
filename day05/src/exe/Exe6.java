package exe;

import java.util.Scanner;

/**
 * @author lystart
 * @create 2023-02-11 10:59
 */
public class Exe6 {
//    先从键盘输入本组学员的人数，再从键盘输入本组学员的姓名和成绩，最后统计：
//
//            - 本组学员的平均分，
//            - 低于平均分的学员人数，
//            - 哪些学员低于平均分，
//            - 最高分和最低分分别是谁。
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("本组学员人数:");
    int quantity = input.nextInt();
    System.out.println("学员姓名");
    String name = input.next();
    System.out.println("学员成绩");
    input.nextInt();
}
}
