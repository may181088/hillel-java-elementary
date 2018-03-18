package ua.od.hillel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int numRows = enterPascalsTriangleSize();

        int items[][] = new int[numRows + 1][numRows + 1];

        createPascalsTriangle(numRows, items);
        outPascalsTriangle(numRows, items);
    }

    public static int enterPascalsTriangleSize() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How match rows?: ");
        return Integer.parseInt(reader.readLine());
    }

    public static void createPascalsTriangle(int numRows, int[][] items) {
        for (int i = 0; i <= numRows; i++) {
            items[i][0] = items[i][i] = 1;
            for (int j = 1; j < i; j++) {
                items[i][j] = items[i - 1][j - 1] + items[i - 1][j];
            }
        }
    }

    public static void outPascalsTriangle(int numRows, int[][] items) {
        for (int i = 0; i <= numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.format("%d ", items[i][j]);
            }
            System.out.println();
        }
    }
}
