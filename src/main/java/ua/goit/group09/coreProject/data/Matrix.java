package ua.goit.group09.coreProject.data;

import java.util.Arrays;

/**
 * Class with matrix data
 */
public class Matrix {
    /* permissible error of the comparison */
    public static final double DELTA = 10E-9;
    /* number of lines in matrix */
    private int lines;
    /* number of columns in matrix */
    private int columns;
    /* 2-dimension array with matrix elements */
    private double[][] array;

    /* Default constructor */
    public Matrix() {
    }

    /* Constructor by numbers of lines & columns */
    public Matrix(int lines, int columns) {
        this();
        this.lines = lines;
        this.columns = columns;
    }

    /* Full constructor */
    public Matrix(int lines, int columns, double[][] array) {
        this.lines = lines;
        this.columns = columns;
        this.array = array;
    }

    /* ================ Getters & Setters =================== */

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public double[][] getArray() {
        return array;
    }

    public void setArray(double[][] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Matrix that = (Matrix) obj;

        if (lines != that.lines) return false;
        if (columns != that.columns) return false;
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                if (Math.abs(array[i][j] - that.array[i][j]) > DELTA) return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = lines;
        result = 31 * result + columns;
        result = 31 * result + Arrays.deepHashCode(array);
        return result;
    }
}