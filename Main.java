import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //LAb4

        ComplexNumber a = new ComplexNumber(2.0, 3.0);
        ComplexNumber b = new ComplexNumber(1.0, 4.0);
        ComplexNumber c = new ComplexNumber();
        // Переопределенные методы
        System.out.println(a.toString());
        System.out.println(b.equals(a));
        System.out.println(a.add(b));

        // longreal
        System.out.println("----------------------------------------!!!---------------------------------------------------");
        LongInteger aa = new LongInteger("123456789987654321");
        LongInteger bb = new LongInteger("123456789876543212345678");
        System.out.println(aa.add(bb));
        LongInteger aaaaaa = new LongInteger("5");
        System.out.println(aaaaaa.factorial());
        System.out.println("----------------------------------------!!!---------------------------------------------------");
        //lab 5

        Circle circle = new Circle(1,1,1,5);
        circle.print();
        Cylinder cylinder = new Cylinder(1,1,1,4,5);
        System.out.println(cylinder.calculateArea());
        System.out.println(cylinder.calculateVolume());
        System.out.println(cylinder.calculateVolume(100));
        System.out.println(cylinder.calculateVolume(200));
        System.out.println(cylinder.calculateVolume(300));
        System.out.println(cylinder.calculateVolume(100));
        System.out.println(cylinder.calculateVolume(100));



    }
}

