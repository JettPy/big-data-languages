package lab3.var1;

import java.util.Scanner;

// Лабораторная работа 3
// Вариант 1
// Задание 1
public class VectorsFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of pairs: ");
        int n = scanner.nextInt();
        Matrix[] vectors = new Matrix[n * 2];
        for (int i = 0; i < n * 2; i++) {
            int[][] vector_elements = new int[3][1];
            for (int j = 0; j < 3; j++) {
                int element = (int)(Math.random() * (2 * 3 + 1)) - 3;
                vector_elements[j][0] = element;
            }
            vectors[i] = new Matrix(vector_elements);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Pair number " + (i + 1) + ":");
            System.out.println(vectors[2 * i]);
            System.out.println(vectors[2 * i + 1]);
            System.out.println("Scalar product: " + Matrix.scalarProduct(vectors[2 * i], vectors[2 * i + 1]));
            System.out.println("Modules: " + Matrix.module(vectors[2 * i]) + " " + Matrix.module(vectors[2 * i + 1]));
        }

    }
}
