package lab2;

import java.util.Scanner;

// Лабораторная работа 2
// Вариант 2
// Задание 1
public class OrderByK {

    public static void printMatrix(int[][] matrix) {
        for(int[] row: matrix) {
            for (int element: row) {
                System.out.printf("%4d", element);
            }
            System.out.println();
        }
    }

    public static void sortMatrixByKRow(int[][] matrix, int k) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - i - 1; j++) {
                if (matrix[k][j + 1] < matrix[k][j]) {
                    for (int t = 0; t < matrix.length; t++) {
                        int tmp_element = matrix[t][j + 1];
                        matrix[t][j + 1] = matrix[t][j];
                        matrix[t][j] = tmp_element;
                    }
                }
            }
        }
    }

    public static void sortMatrixByKColumn(int[][] matrix, int k) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix.length - i - 1; j++) {
                if (matrix[j + 1][k] < matrix[j][k]) {
                    for (int t = 0; t < matrix.length; t++) {
                        int tmp_element = matrix[j + 1][t];
                        matrix[j + 1][t] = matrix[j][t];
                        matrix[j][t] = tmp_element;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int element = (int)(Math.random() * (2 * n + 1)) - n;
                matrix[i][j] = element;
            }
        }
        printMatrix(matrix);
        System.out.print("Enter 1 to sort by row or 2 to sort by column: ");
        int rule = scanner.nextInt();
        if (rule == 1) {
            System.out.print("Enter row number (1 - " + n + "): ");
        } else {
            System.out.print("Enter column number (1 - " + n + "): ");
        }
        int k = scanner.nextInt() - 1;
        if (rule == 1) {
            sortMatrixByKRow(matrix, k);
        } else {
            sortMatrixByKColumn(matrix, k);
        }
        System.out.println("Sorted matrix:");
        printMatrix(matrix);
    }
}
