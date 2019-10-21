package XXIX;

import java.util.ArrayList;

/**
 * @author kavin
 * @date 2019-10-20 10:23
 */
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if (matrix == null) {
            return null;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        ArrayList<Integer> arrayList = new ArrayList();

        while (cols>start*2 && rows>start*2) {
            arrayList = printMatrixInCircle(arrayList, matrix, cols, rows, start);
            start++;
        }
        return arrayList;
    }

    private ArrayList<Integer> printMatrixInCircle(ArrayList<Integer> arr, int[][] matrix, int cols, int rows, int start) {
        int endX = cols-1-start;
        int endY = rows-1-start;

        //left-->right
        for (int i=start; i<=endX; i++) {
            int number = matrix[start][i];
            arr.add(number);
        }

        //top-->bottom
        if (start<endY) {
            for (int i=start+1; i<=endY; i++) {
                int number = matrix[i][endX];
                arr.add(number);
            }
        }

        //right-->left
        if (start<endX && start<endY) {
            for (int i=endX-1; i>=start; i--) {
                int number = matrix[endY][i];
                arr.add(number);
            }
        }

        //bottom-->top
        if (start<endX && start<endY-1){
            for (int i=endY-1; i>=start+1; i--) {
                int number = matrix[i][start];
                arr.add(number);
            }
        }
        return arr;
    }
}
