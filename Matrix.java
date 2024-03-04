public class Matrix {
    private int rows;
    private int columns;
    private int[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setElement(int row, int column, int value) {
        data[row][column] = value;
    }

    public int getElement(int row, int column) {
        return data[row][column];
    }

    public Matrix add(Matrix otherMatrix) {
        if (this.rows != otherMatrix.getRows() || this.columns != otherMatrix.getColumns()) {
            throw new IllegalArgumentException("матрицы должны иметь одинаковое значение в полях столбы и строки");
        }

        Matrix resultMatrix = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix.setElement(i, j, this.getElement(i, j) + otherMatrix.getElement(i, j));
            }
        }
        return resultMatrix;
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}