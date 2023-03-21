package com.atguigu.homework.test3;

/**
 * @author lystart
 * @create 2023-02-14 19:23
 */
public class Test {
    public static void main(String[] args) {
        Bird[] birds = new Bird[3];

        birds[0] = new Penguin();
        birds[1] = new Swan();
        birds[2] = new Chicken();


        for (Bird bird : birds) {
            bird.eat();

            if (bird instanceof Swimming) {
                ((Swimming) bird).swim();
            }
            if(bird instanceof Flyable) {
                ((Flyable)bird).fly();
            }
            System.out.println();
        }
    }
}
