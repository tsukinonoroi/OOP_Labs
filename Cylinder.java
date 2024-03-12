public class Cylinder extends Circle {
    private double height;

    public Cylinder(double x, double y, double z, double radius, double height) {
        super(x, y, z, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 2 * Math.PI * getRadius() * getRadius() + 2 * Math.PI * getRadius() * height;
    }

    public double calculateVolume() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    public double calculateVolume(double density) {
        return density + calculateVolume();
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" height = " + height);
    }
}
