import java.util.Objects;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    public void set(ComplexNumber other) {
        this.real = other.real;
        this.imaginary = other.imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber negate() {
        return new ComplexNumber(-this.real, -this.imaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        return this.add(other.negate());
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ComplexNumber other = (ComplexNumber) obj;
        return Double.compare(other.real, real) == 0 && Double.compare(other.imaginary, imaginary) == 0;
    }


    @Override
    public String toString() {
        return "ComplexNumber{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }

}