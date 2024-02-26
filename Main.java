import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Студент */
        Student Edem = new Student("Сейтумеров", "Эдем", "Рустемович","30.04.2004", "Яркое Поле, Калинина 21", "+79781668832", "ФЭМиИТ", 3);
        /*Пример инициализации объекта если бы не было конструктора класса
            Student Edem = new Student();
            Edem.surname = "Seytumerov";
            Edem.name = "Edem";
            Edem.adress = "YarkoePole, Kalinina21";
            ........................................................
         */
        System.out.println(Edem);
        Scanner scan = new Scanner(System.in);
        System.out.println("Какой язык программирования учит студент ? Java или Python ?");
        String PL = scan.next();
        if (PL.equals("Java") || PL.equals("java")) {
            Edem.LearningJava();
        }
        else if (PL.equals("Python") || PL.equals("python")) {
            Edem.LearningPython();
        }
        else {
            System.out.println("err0r");
        }
        System.out.println(Edem.adress);
        System.out.println(Edem.getAdress());



        /*Поезд*/
        Train Sapsan_Moscow_SainPeter = new Train();
        Sapsan_Moscow_SainPeter.PunktNazn = "Санкт-Петербург";
        Sapsan_Moscow_SainPeter.train_num = 1234567;
        Sapsan_Moscow_SainPeter.timestarth = 16;
        Sapsan_Moscow_SainPeter.timestartm = 00;
        Sapsan_Moscow_SainPeter.timeendh = 20;
        Sapsan_Moscow_SainPeter.timeendm = 00;
        Sapsan_Moscow_SainPeter.num_of_all_places = 60;
        Sapsan_Moscow_SainPeter.num_of_coupe = 40;
        Sapsan_Moscow_SainPeter.num_of_plackart = 20;
        System.out.println("Который час?");
        short timeh = scan.nextShort();
        short timem = scan.nextShort();
        System.out.printf("Текущее время %02d:%02d%n", timeh, timem);

        if (timeh < Sapsan_Moscow_SainPeter.timestarth) {
            Sapsan_Moscow_SainPeter.train_not_start();
        }

        else if (timeh >= Sapsan_Moscow_SainPeter.timestarth && timem >= Sapsan_Moscow_SainPeter.timestartm && timeh < Sapsan_Moscow_SainPeter.timeendh) {
            Sapsan_Moscow_SainPeter.train_in_way();
        }

        else {
            Sapsan_Moscow_SainPeter.train_in_end();
        }

        /* Комплексные числа */

        ComplexNumber a = new ComplexNumber(10, 15);
        ComplexNumber b = new ComplexNumber(3, 4);
        ComplexNumber sum = a.add(b);
        System.out.println(sum);


        /* Треугольник */

        Triangle one = new Triangle(15,15,15);
        one.isEquilateral();
        one.calculateArea();

    }
}

