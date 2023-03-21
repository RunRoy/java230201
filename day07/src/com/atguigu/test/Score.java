package com.atguigu.test;

public class Score {
    public int lang;
    public int math;
    public int english;

    public int getSum(){
        return lang+math+english;
    }

    public int getAvg(){
        return getSum() / 3;
    }
}
