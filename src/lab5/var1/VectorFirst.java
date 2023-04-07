package lab5.var1;

import java.util.Scanner;

public class VectorFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of pairs: ");
        String buffer = scanner.nextLine();
        int n;
        try {
           n = Integer.parseInt(buffer);
        } catch (NumberFormatException e) {
            System.out.println("Not valid input, should be int!");
            return;
        }
        Matrix[] vectors;
//        n = Integer.MAX_VALUE / 2;
        try {
            vectors = new Matrix[n * 2];
        } catch (NegativeArraySizeException e) {
            System.out.println("Count of pairs must not be less than 1!");
            return;
        } catch (OutOfMemoryError e) {
            System.out.println("Too big count of matrix!");
            return;
        }
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
