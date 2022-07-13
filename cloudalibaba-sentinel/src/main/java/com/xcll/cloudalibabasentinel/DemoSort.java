package com.xcll.cloudalibabasentinel;

import java.time.ZonedDateTime;

public class DemoSort {

    /**
     * 选择排序 (找到比第一个小的值；进行替换)
     *  arr : {9, 1, 3, 2, 8, 4, 5}
     *
     *  arr[0]
     *      1 - arr.length-1 找出比arr[0] 小的值； 找到之后进行修改 arr[0] = arr[n] && arr[n] = arr[0]
     *
     *  arr[1]
     *      2 - arr.lenth-1 找出比arr[1] 小的值； 找到之后进行修改 arr[1] = arr[n] && arr[n] = arr[1]
     *
     *
     * @param arr
     */
    private static void xuanZheSort(int[] arr) {
        for (int i = 0; i < arr.length; i ++) {
            for (int j = i +1; j < arr.length; j ++) {
                int minArrIndex = arr[i] > arr[j] ? j : i;
                swap(arr, i, minArrIndex);
            }
        }

    }

    /**
     * 冒泡排序
     *  arr : {9, 1, 3, 2, 8, 4, 5}
     *
     * arr[i] > arr[i + 1] ? swap : "";
     *
     * @param arr
     */
    public static void maoPaoSort(int [] arr) {

        for (int i = arr.length; i > 0; i--) {
            for (int j = 1; j < i ; j ++ ) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j -1 , j);
                }
            }
        }
    }




    /**
     * 插入排序2
     *  arr : {9, 1, 3, 2, 8, 4, 5}
     *
     *  1、 arr[0] 进行排序 -
     *  2、 arr[0] - arr[1] 排序 -
     *  3、 arr[1] - arr[2]
     *  4、arr[2] - arr[3]
     *
     *       arr.length 外层循环 for (int i = 0; i < arr.length; i++)
     *  0 - 0
     *  0 - 1；
     *  0 - 2；
     * @param arr
     */
    public static void insertSort(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int newArrIndex = i;
            while (newArrIndex > 0 && arr[newArrIndex - 1] > arr[newArrIndex]) {        // 每次想前找 直到找到 0 这个位置则跳出
                swap(arr, newArrIndex - 1, newArrIndex);
                newArrIndex --;
            }

        }
    }


    /**
     * 插入排序
     *  arr : {9, 1, 3, 2, 8, 4, 5}
     *
     *  1、 arr[0] 进行排序 -
     *  2、 arr[0] - arr[1] 排序 -
     *  3、 arr[1] - arr[2]
     *  4、arr[2] - arr[3]
     *
     *
     *  0 - 0
     *  0 - 1
     *  0 - 2
     *  0 - arr.length - 1
     *
     * @param arr
     */
    public static void insertSort2(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j -- ) {
                swap(arr, j - 1, j);
            }
        }
    }




















    private static void swap(int[] arr, int i, int minArrIndex) {
        int temp = arr[i];
        arr[i] = arr[minArrIndex];
        arr[minArrIndex] = temp;
    }


    public static void pringArr(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int [] arr = {9, 1, 3, 2, 8, 4, 5 , 0};
        pringArr(arr);
//        insertSort2(arr);



        pringArr(arr);

        ZonedDateTime zbj = ZonedDateTime.now();//默认时区
        System.out.println(zbj);

    }

}
