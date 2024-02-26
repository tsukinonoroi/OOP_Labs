public class ComplexNumber {
    private double realPart = 5;
    private double imaginaryPart= 10;
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /*Инициализирующий конструктор с параметрами по умолчанию*/
    public ComplexNumber() {
        this.real = realPart;
        this.imaginary = imaginaryPart;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double resultReal = this.real + other.real;
        double resultImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(resultReal, resultImaginary);
    }

    public void close() {
        // псевдо-деструктор
        System.out.println("псевдо-удаление объект");
    }
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}