package com.alevel.homework6;

public class Main {

    public static void main(String[] args) {
        int[][] triangle = new int[4][];
        triangle[0] = new int[1];
        triangle[1] = new int[2];
        triangle[2] = new int[3];
        triangle[3] = new int[4];
//triangle[4] = new int[5];
        System.out.println(triangle.length + "!");// wrapped this line before the loop  for(int i..
        for (int i = 0; i < triangle.length; i++) {
            System.out.println("i = " + i);
            System.out.println(triangle[i].length);// wrapped this line before the loop for(int j..
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = 0;
            }
        }
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {// change i to j
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}

