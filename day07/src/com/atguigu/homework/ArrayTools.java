package com.atguigu.homework;

import java.time.temporal.Temporal;

/**
 * @author lystart
 * @create 2023-02-10 20:04
 */
public class ArrayTools {

    /**
     * 使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，
     * 如果数组arr不是有序的，结果将不一定正确
     * @param arr
     * @param value
     * @return
     */
   public  int  binarySearch(int[]  arr,  int  value){
       int index = -1;
        for (int left = 0,right = arr.length - 1 ; left <=right;) {
            int mid = left + (right-left) / 2;

            if(arr[mid] == value){
                index = mid;
            } else if (value > arr[mid]) {
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        if (index == -1){
            System.out.println(value);
        }
        return - 1;
    }

    /**
     * 使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，
     * 如果数组arr不是有序的，结果将不一定正确
     * @param arr
     * @param value
     * @return
     */
    public int  binarySearch(char[]  arr,  char  value){
      return binarySearch(arr,value);
    }

    /**
     * 使用二分查找法在arr数组中查找value的下标，如果value不存在，就返回-1，
     * 如果数组arr不是有序的，结果将不一定正确
     * @param arr
     * @param value
     * @return
     */
    public int  binarySearch(double[]  arr,  double  value){
       return binarySearch(arr,value);
    }

    /**
     * 可以给arr数组从小到大排序，用冒泡排序实现
     * @param arr
     */
    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] > arr[j +1]){
                int temp = arr[j];
                arr[j] = arr[j +1];
                arr[j+1] = temp;
                }
            }
        }
    }

    public void sort(char[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length -i; j++) {
                if(arr[j] > arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = arr[j];
                }
            }
        }
    }

    public void sort(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = 0;
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

   public  String toString(int[] arr){
        String result = "{";
       for (int i = 0; i < arr.length; i++) {
           if(i < arr.length -1){
               result += arr[i] + ",";
           }else {
               result += arr[i];
           }
       }
           result += "}";
           return result;
   }

   public String toString(double[] arr){
        return toString(arr);
   }


    public String toString(char[] arr){
        return toString(arr);
    }
}
