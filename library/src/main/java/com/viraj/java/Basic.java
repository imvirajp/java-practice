package com.viraj.java;

public class Basic {
    public boolean isEven(int number) {
        return number%2 == 0;
    }

    public boolean isOdd(int number) {
        return number%2 == 1;
    }

    public double square(double number) {
        return number * number;
    }

    public double cube(double number) {
        return number * number * number;
    }

    public int averageOf(int first, int second, int third) {
        return (first+second+third)/3;
    }

    public int greatestOf(int first, int second, int third) {
        if (first > second && first > third) return first;
        else if (second > third) return second;
        else return third;
    }

}
