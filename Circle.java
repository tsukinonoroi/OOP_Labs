public class Circle extends Point {
    private double radius;

    public Circle(double x, double y, double z, double radius) {
        super(x, y, z);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("radius =  " + radius);
    }
}