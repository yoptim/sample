package com.example.algo;

/**
 * Created by tony on 2018/4/14.
 */
public class SelectSort {

    public void sort(int[] data) {
        // find the min value among [0 .. n-1]
        for (int i = 0; i < data.length; i++) {
            int indexOfMin = indexOfMin(data, i);
            swap(data, i, indexOfMin);
        }
    }

    private int indexOfMin(int[] data, int i) {
        int min = data[i];
        int indexOfMin = i;
        for (int j = i; j < data.length; j++) {
            if( data[j] < min) {
                min = data[j];
                indexOfMin  = j;
            }
        }

        return indexOfMin;
    }

    void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }


}
