package lab3.var1;

import static java.lang.Math.pow;

// Лабораторная работа 3
// Вариант 1
// Задание 1, 2
public class Matrix {
    private final int[][] values;
    private final int rows;
    private final int columns;

    public Matrix(int n) {
        this.rows = n;
        this.columns = n;
        this.values = new int[n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; j++)
                this.values[i][j] = 0;
    }

    public Matrix(int n, int m) {
        this.rows = m;
        this.columns = n;
        this.values = new int[m][n];
    }

    public Matrix(int[][] values) {
        this.values = new int[values.length][];
        this.rows = values.length;
        this.columns = this.rows != 0 ? values[0].length : 0;
        for (int i = 0; i < values.length; i++)
            this.values[i] = values[i].clone();
    }

    public Matrix add(Matrix matrix) {
        int[][] new_values = new int[this.rows][this.columns];
        for (int i = 0; i < this.rows; i++)
            for (int j = 0; j < this.columns; j++)
                new_values[i][j] = this.values[i][j] + matrix.values[i][j];
        return new Matrix(new_values);
    }

    public Matrix subtract(Matrix matrix) {
        int[][] new_values = new int[this.rows][this.columns];
        for (int i = 0; i < this.rows; i++)
            for (int j = 0; j < this.columns; j++)
                new_values[i][j] = this.values[i][j] - matrix.values[i][j];
        return new Matrix(new_values);
    }

    public Matrix multiply(Matrix matrix) {
        int[][] new_values = new int[this.rows][matrix.columns];
        for (int i = 0; i < this.rows; i++)
            for (int j = 0; j < this.columns; j++)
                for (int k = 0; k < matrix.columns; k++)
                    new_values[i][k] += this.values[i][j] * matrix.values[j][k];
        return new Matrix(new_values);
    }
    public Matrix multiply(int coefficient) {
        int[][] new_values = new int[this.rows][this.columns];
        for (int i = 0; i < this.rows; i++)
            for (int j = 0; j < this.columns; j++)
                new_values[i][j] = this.values[i][j] * coefficient;
        return new Matrix(new_values);
    }


    public void increment() {
        for (int i = 0; i < this.rows; i++)
            for (int j = 0; j < this.columns; j++)
                this.values[i][j] += 1;
    }

    public void decrement() {
        for (int i = 0; i < this.rows; i++)
            for (int j = 0; j < this.columns; j++)
                this.values[i][j] -= 1;
    }

    public int get_element(int row, int column) {
        return this.values[row][column];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++)
                result.append(this.values[i][j]).append(" ");
            result.append("\n");
        }
        return result.toString();
    }

    public static int scalarProduct(Matrix a, Matrix b) {
        int result = 0;
        for (int i = 0; i < a.rows; i++)
               result += a.values[i][0] * b.values[i][0];
        return result;
    }

    public static double angle(Matrix a, Matrix b) {
        double scalarProduct = 0;
        int a_part = 0;
        int b_part = 0;
        for (int i = 0; i < a.rows; i++) {
            scalarProduct += a.values[i][0] * b.values[i][0];
            a_part += pow(a.values[i][0], 2);
            b_part += pow(b.values[i][0], 2);
        }
        if (a_part == 0 || b_part == 0)
            return 0;
        return Math.acos(scalarProduct / (Math.sqrt(a_part) * Math.sqrt(b_part))) * 180 / Math.PI;
    }

    public static double module(Matrix a) {
        int result = 0;
        for (int i = 0; i < a.rows; i++)
            result += pow(a.values[i][0], 2);
        return Math.sqrt(result);
    }

    public static boolean isCollinear(Matrix a, Matrix b) {
        if (a.rows == 0 || b.rows == 0)
            return true;
        boolean result = true;
        double coefficient = a.values[0][0] * 1.0 / b.values[0][0];
        for (int i = 1; i < a.rows; i++)
            result = result && (Math.abs(a.values[i][0] * 1.0 / b.values[i][0] - coefficient)) < 0.00001;
        return result;
    }

    public static boolean isOrthogonal(Matrix a, Matrix b) {
        return Matrix.scalarProduct(a, b) == 0;
    }
}
