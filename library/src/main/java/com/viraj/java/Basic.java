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

    public int lcm(int first, int second) {
        int result = (first > second) ? first : second;
        while (true) {
            if (result%first == 0 && result%second == 0) return result;
            result++;
        }
    }

    public int gcd(int first, int second) {
        int greater = (first > second) ? first : second;
        int smaller = (first < second) ? first : second;
        int result = smaller;
        while(greater % smaller != 0) {
            result = greater%smaller;
            greater = smaller;
            smaller = result;
        }
        return result;
    }

    public double simpleInterest(double principle, double duration, double rate) {
        return principle * duration * rate;
    }

    public double compoundInterest(double principle, double duration, double rate, double frequency) {
        double times = frequency * duration;
        double effectiverate = rate/frequency;
        double initialprinciple = principle;
        while (times >= 1){
            principle = principle * rate * duration / 100 + principle;
            times--;
        }
        return principle - initialprinciple;
    }
}
