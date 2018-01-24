package com.lisheng.sort;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {4, 7, 98, 43, 11, 0, 9};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i + ",");
        }
    }

    private static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
