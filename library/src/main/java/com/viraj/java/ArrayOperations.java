package com.viraj.java;

import java.util.ArrayList;

public class ArrayOperations {
    public ArrayList<Integer> selectEven(int[] numbers) {
        ArrayList<Integer> evens = new ArrayList<>();
        for (int number : numbers) {
            if (number%2 == 0) evens.add(number);
        }
        return evens;
    }

    public ArrayList<Integer> selectOdd(int[] numbers) {
        ArrayList<Integer> odds = new ArrayList<>();
        for (int number : numbers) {
            if (number%2 != 0) odds.add(number);
        }
        return odds;
    }

    public ArrayList<Integer> reverseList(int[] numbers) {
        ArrayList<Integer> reverseList = new ArrayList<>();
        for (int number : numbers) {
            reverseList.add(0, number);
        }
        return reverseList;
    }
}
