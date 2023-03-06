package Lesson_02032023;

import java.util.Arrays;

public class AppArray {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] arrayTwo = {};

        //    int [][] arr = {{5,7,9},{13,4,1},{17,44,22,33}};
        //    for (int i = 0; i < arr.length; i++){
        //        for (int j = 0; j < arr[i].length; j++){
        //            System.out.print(arr[i][j] + " ");
        //        }
        //        System.out.println("");
        //    }
        //}
        //int[][][] arrThree = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        //for (int i = 0; i < 2; i++) {
        //    for (int j = 0; j < 2; j++) {
        //        for (int k = 0; k < 2; k++) {
        //            System.out.println("arr[" + i + "][" + j + "][" + k + "]=" + arrThree[i][j][k]);
        //        }
        //    }
        //}
        int[][] arrFour = {{1,2},{3,4},{5,6,7,8},{1}};

//Arrays.sort();

        int [] binarySearchArray = {1,2,3,4,5,6,8,9,11,14,16,23,25,34};
        System.out.println(arrFour[0][1]);
        System.out.println(arrFour[1][0]);
        System.out.println(Arrays.deepToString(arrFour));
    }
}