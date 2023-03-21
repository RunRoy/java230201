package com.atguigu.test1;

import com.atguigu.test.Score;

public class Student {
    public String stuName;
    public int score;

  public int getLevel( int score){
        int leve = 0;
        if(score >= 90){
            leve = 5;
        }else if (score >= 80){
            leve = 4;
        }else if(score >= 70){
            leve = 3;
        }else if (score >= 60){
            leve = 2;
        }else {
            leve = 1;
        }
        return leve;
  }

    public void showInfo(){
        System.out.println("学员姓名："+stuName+"，学员分数："+score+"，学员等级："+getLevel(score));
    }
}
