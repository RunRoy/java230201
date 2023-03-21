package com.atguigu.homework.test3;

import org.junit.Test;

/**
 * @author lystart
 * @create 2023-02-15 18:48
 */
public enum Color {

    RED(225,0,0,"赤"),
    ORANGE(225,128,0,"橙"),
    YELLOW(255,255,0,"黄"),
    GREEN(0,255,0,"绿"),
    CYAN(0,255,255,"青"),
    BLUE(0,0,255,"蓝"),
    PURPLE(128,0,255,"紫色");

    private final int red;
    private final int green;
    private final int blue;
    private final String description;

    Color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString()+ "\t(" + green + "," + red + "," + blue + ")->" + description;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public String getDescription() {
        return description;
    }
}
