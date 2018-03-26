package com.viraj.java;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArrayTest {

    private ArrayOperations arrayOperations;
    private int[] numbers;

    @Before
    public void setUp() {
        arrayOperations = new ArrayOperations();
        numbers = new int[] {1,2,3,4,5,6,7,8,9};
    }

    @Test
    public void selectEven() {
        ArrayList<Integer> actual = arrayOperations.selectEven(numbers);
        assertEquals(Arrays.asList(2,4,6,8),actual);
    }

    @Test
    public void selectOdd() {
        ArrayList<Integer> actual = arrayOperations.selectOdd(numbers);
        assertEquals(Arrays.asList(1,3,5,7,9),actual);
    }

    @Test
    public void reverseList() {
        ArrayList<Integer> actual = arrayOperations.reverseList(numbers);
        assertEquals(Arrays.asList(9,8,7,6,5,4,3,2,1),actual);
    }
}
