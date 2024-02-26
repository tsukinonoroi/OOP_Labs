public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public void calculateArea() {
        double s = calculatePerimeter() / 2.0;
        System.out.println(Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)));
    }

    public void isEquilateral() {
        if (sideA == sideB && sideB == sideC) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}