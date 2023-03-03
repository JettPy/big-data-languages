package lab2;

import java.util.Scanner;

// Лабораторная работа 2
// Вариант 2
// Задание 2
enum Direction { UP, DOWN, LEFT, RIGHT }

public class CyclicShift {

    public static void printMatrix(int[][] matrix) {
        for(int[] row: matrix) {
            for (int element: row) {
                System.out.printf("%4d", element);
            }
            System.out.println();
        }
    }

    public static void matrixShift(int[][] matrix, int k, Direction direction) {
        for (int t = 0; t < k; t++) {
            switch (direction) {
                case UP -> {
                    for (int j = 0; j < matrix.length; j++) {
                        int first_element = matrix[0][j];
                        for (int i = 0; i < matrix.length - 1; i++) {
                            matrix[i][j] = matrix[i + 1][j];
                        }
                        matrix[matrix.length - 1][j] = first_element;
                    }
                }
                case DOWN -> {
                    for (int j = 0; j < matrix.length; j++) {
                        int last_element = matrix[matrix.length - 1][j];
                        for (int i = 0; i < matrix.length - 1; i++) {
                            matrix[i + 1][j] = matrix[i][j];
                        }
                        matrix[0][j] = last_element;
                    }
                }
                case LEFT -> {
                    for (int i = 0; i < matrix.length; i++) {
                        int first_element = matrix[i][0];
                        for (int j = 0; j < matrix.length - 1; j++) {
                            matrix[i][j] = matrix[i][j + 1];
                        }
                        matrix[i][matrix.length - 1] = first_element;
                    }
                }
                case RIGHT -> {
                    for (int i = 0; i < matrix.length; i++) {
                        int last_element = matrix[i][matrix.length - 1];
                        for (int j = 0; j < matrix.length - 1; j++) {
                            matrix[i][j + 1] = matrix[i][j];
                        }
                        matrix[i][0] = last_element;
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
        System.out.print("Enter a value for shift: ");
        int k = scanner.nextInt();
        System.out.print("Enter direction (up, down, left, right): ");
        scanner.nextLine();
        String direction = scanner.nextLine();
        switch (direction) {
            case "up" -> matrixShift(matrix, k, Direction.UP);
            case "down" -> matrixShift(matrix, k, Direction.DOWN);
            case "left" -> matrixShift(matrix, k, Direction.LEFT);
            case "right" -> matrixShift(matrix, k, Direction.RIGHT);
        }
        System.out.println("Shifted matrix:");
        printMatrix(matrix);
    }
}
