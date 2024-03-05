package task3;

public class Main {
    public static void main(String[] args) {
        Matrix m = new Matrix();

        m.setValue(0, 0, 4);
        m.setValue(0, 1, 5);
        m.setValue(1, 0, 9);
        m.setValue(1, 1, 12);
        System.out.println("Матрица 1");
        m.printMatrix();

        Matrix m2 = new Matrix();
        m2.setValue(0, 0, 1);
        m2.setValue(0, 1, 2);
        m2.setValue(1, 0, 3);
        m2.setValue(1, 1, 4);
        System.out.println("Матрица 2");
        m.printMatrix();

        Matrix m3 = new Matrix();
        m3.multiMatrix(m, m2);
        System.out.println("Умножение двух матриц");
        m3.printMatrix();

        m.sum(m2);
        System.out.println("Сложение матрицы 1 с матрицей 2");
        m.printMatrix();

        m.multiNum(2);
        System.out.println("Умножение матрицы 1 на число");
        m.printMatrix();
    }
}
