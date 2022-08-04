package com.bridgelabz;

public class Average {
    public static void main(String[] args) {
        double array[] = {25,16,19.5,100,47.3};
        double total = 0;

        for(int i=0; i<array.length;i++){
            total = total + array[i];
        }
        double average = total / array.length;
        System.out.format("The average is: %.3f",average);
    }
}
