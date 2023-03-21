package com.atguigu.homework;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author lystart
 * @create 2023-02-27 21:02
 */
public class Exer5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("words.txt"));
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
        input.close();
    }

    @Test
    public void test() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        PrintStream ps = new PrintStream("words.txt");
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "句话");
            String line = scanner.nextLine();
            ps.println(line);
        }
        scanner.close();
        ps.close();

    }

}
