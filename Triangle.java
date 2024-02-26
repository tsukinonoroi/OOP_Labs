public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    /* Конструктор с параметрами */
    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /* Конструктор без параметров*/
    public Triangle() {
        this.sideA = 0;
        this.sideB = 0;
        this.sideC = 0;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
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