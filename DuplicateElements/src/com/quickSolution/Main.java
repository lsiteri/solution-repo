package com.quickSolution;

import java.util.*;

public class Main {
    static final int SIZE=10_000_000;

    public static void main(String[] args) {
        int[] array = new int[SIZE];

        Long start = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(SIZE);
        }
        Long now = System.currentTimeMillis();
        System.out.printf("Numbers generated in %f %s",(now-start)/1000F, System.lineSeparator());

        findDuplicates(array);
        Long afterSetSolution = System.currentTimeMillis()-now;
        System.out.println(System.lineSeparator()+ "Set Solution time: " + afterSetSolution/1000F);

    }

    private static void findDuplicates(int [] source) {
        int bytesNeeded = (source.length/8) + 1;
        byte[] bitSet = new byte[bytesNeeded];

        for(int i=0; i<source.length; i++){
            int n = source[i];
            int byteIndex = n / 8;
            int indexInByte = n % 8;

            byte bit = (byte)(bitSet[byteIndex] & (1 << indexInByte));
            if(bit > 0){
                System.out.print(source[i] + " ");
            }else{
                bitSet[byteIndex] |= 1 << indexInByte;
            }
        }
    }


}
