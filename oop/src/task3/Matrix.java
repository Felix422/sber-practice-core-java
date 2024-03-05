package task3;

public class Matrix {
    int rowCount = 2;
    int columnCount = 2;
    double[][] arr = new double[rowCount][columnCount];

    public void setValue(int i, int j, double value) {
        arr[i][j] = value;
    }

    public void sum(Matrix m) {
        if (rowCount != m.rowCount || columnCount != m.columnCount) {
            System.out.println("Матрицы разного размера");
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    setValue(i, j, (m.arr[i][j] + arr[i][j]));
                }
            }
        }
    }

    public void multiNum(double number) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                setValue(i, j, (arr[i][j] * number));
            }
        }
    }

    public void multiMatrix(Matrix m1, Matrix m2) {
        if (m1.columnCount != m2.rowCount) {
            System.out.println("Матрицы не могут быть перемножены");
        } else {
            rowCount = m1.rowCount;
            columnCount = m2.columnCount;
            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < columnCount; j++) {
                    for (int k = 0; k < m1.columnCount; k++) {
                        setValue(i, j, arr[i][j] + m1.arr[i][k] * m2.arr[k][j]);
                    }
                }
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
