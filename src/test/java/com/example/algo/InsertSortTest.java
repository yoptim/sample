package com.example.algo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by tony on 2018/4/15.
 */
public class InsertSortTest {
    InsertSort sort;

    @Before
    public void setUp() throws Exception {
        sort = new InsertSort();
    }

    @Test
    public void sort() throws Exception {
        int[] raw = new int[]{2, 1, 3, 5};
        sort.sort(raw);
        assertArrayEquals(new int[]{1, 2, 3, 5}, raw);

        int[] raw2 = new int[]{6, 9, 1, 10, 1, 3, 5};
        sort.sort(raw2);
        assertArrayEquals(new int[]{1, 1, 3, 5, 6 , 9, 10}, raw2);

    }

    @Test
    public void insert() throws Exception {
        int[] raw = new int[]{2, 1, 3, 5};
        sort.shift(raw, 1, 1, 3);
        System.out.println(Arrays.toString(raw));
    }

    @Test
    public void findPlace() throws Exception {
        int[] raw = new int[]{1, 3, 5, 2};
        assertEquals(1, sort.findPlace(raw, 0, 2, 2));
        assertEquals(2, sort.findPlace(raw, 0, 1, 5));
    }

}