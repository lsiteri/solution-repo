package com.jtechnology.test;

public class Main implements TestDataI{

    public static void main(String[] args) {
        double maxAvgValue = 0;
        for (int row = 0; row < MATRIX.length; row++) {
            double sumOfRow=0;
            for (int column = 0; column < MATRIX[row].length; column++) {
                 sumOfRow+= Double.parseDouble(MATRIX[row][column]);
                if(maxAvgValue < sumOfRow/MATRIX[row].length){
                    maxAvgValue = sumOfRow/MATRIX[row].length;
                }
            }
        }
        System.out.println(maxAvgValue);
    }
}
