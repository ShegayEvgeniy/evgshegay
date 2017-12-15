package ru.job4j.array;

/**
 * Created by Evgeniy on 02.12.2017.
 */
public class RotateArray {

    public int[][] rotateMatrixRight(int[][] matrix) {


        int w = matrix.length;
        int h = matrix[0].length;
        int[][] ret = new int[h][w];
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                ret[i][j] = matrix[w - j - 1][i];
            }
        }

        return ret;

    }

}
