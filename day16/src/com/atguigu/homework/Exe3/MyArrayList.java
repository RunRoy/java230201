package com.atguigu.homework.Exe3;


import java.util.Arrays;

/**
 * @author lystart
 * @create 2023-02-23 21:10
 */
public class MyArrayList<T> {
    private Object[] all = new Object[4];

    private int total;

    public void add(T t){
        if(total >= all.length){
            all = Arrays.copyOf(all , (all.length*2));
        }
        all[total++] = t;
    }

    public T get(int index){
        if(index < 0){
            System.out.println("找不到元素");
        }else if(index >= total){
            System.out.println("越界");
        }
        return (T) all[index];
    }

    public Object toArrayList(){
       return Arrays.copyOf(all,total);
    }

}
