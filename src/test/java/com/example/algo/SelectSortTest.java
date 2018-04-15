package com.example.algo;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by tony on 2018/4/14.
 */
public class SelectSortTest {
    SelectSort sort;
    @Before
    public void setUp() throws Exception {
        sort = new SelectSort();
    }

    @Test
    public void sort() throws Exception {
        int[] raw = new int[]{2, 1, 5, 3};
        sort.sort(raw);
        System.out.println(Arrays.toString(raw));
        assertArrayEquals(new int[] {1, 2, 3, 5}, raw);
    }

    @Test
    public void swap() throws Exception {
        int[] raw = new int[] {1, 2, 3};
        sort.swap(raw, 1, 2);

        assertEquals(2, raw[2]);
    }

}