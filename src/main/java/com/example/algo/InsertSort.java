package com.example.algo;

/**
 * Created by tony on 2018/4/15.
 */
public class InsertSort {
    public void sort(int[] data) {
        // (a1, a2, a3, ... ai, ai+1, ..n)
        for (int i = 1; i < data.length; i++) {
            int toPlace = findPlace(data, 0, i - 1, data[i]);
            shift(data, toPlace, i - 1, data[i]);
        }
    }

    void shift(int[] data, int start, int end, int v) {
        for (int j = end; j >= start; j--) {
            data[j + 1] = data[j];
        }
        data[start] = v;

    }

    int findPlace(int[] data, int start, int end, int v) {
        int i = start;
        for (; i <= end; i++) {
            if(data[i] > v) {
                break;
            }
        }

        return i;
    }
}
