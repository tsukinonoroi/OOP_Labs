import java.util.Scanner;

public class Main {
    private static ComplexNumber global1 = new ComplexNumber();
    //Статик-поле (глобал)
    public static void main(String[] args) {
        /* Студент */
        Student student1 = new Student();
        student1.surname = "Mustafaev";
        student1.name = "Edem";
        student1.patronymic = "Eskenderovich";
        /*......Параметры класса......*/
        Student student2 = new Student("Seytumerov",
                "Edem", "Rustemovich",
                "30.04.2004", "Kalinina, 21",
                "+79781668832", "FEMIT", 3);

        /* Поезд. Инициализирующий конструктор без параметров  */
        Train train1 = new Train();
        train1.train_num = 500;
        System.out.println(train1);

        /* комплексные числа  */
        ComplexNumber local1 = new ComplexNumber();
        local1.close();
        //Создание локального объекта + использование псевдо-деструктора

        /* Треугольник. Set- Get- */

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle(15,15,15);
        System.out.println(triangle1 + " <--Слева без параметров, справа конструктор с параметрами --> " + triangle2);
        System.out.println("Получаем значение(get) sideA ДО метода set " + triangle1.getSideA());
        triangle1.setSideA(10);
        System.out.println("Получаем значение(get) sideA ПОСЛЕ метода set "+ triangle1.getSideA());



        /* 3 laba */
        Scanner scan = new Scanner(System.in);
        ComplexNumber[] complexNumbers = new ComplexNumber[5];
        for (int i = 0; i < complexNumbers.length; i++) {
            System.out.println("Введите реальную часть для " + i + "-ого элемента");
            double realPart = scan.nextInt();
            double imaginaryPart = 2 * (i + 1);

            complexNumbers[i] = new ComplexNumber(realPart, imaginaryPart);

        }

        Triangle triangle = new Triangle();


        System.out.println("Комплексные числа"); {
            for (ComplexNumber complexNumber : complexNumbers) {
                System.out.println(complexNumber);
            }
        }

        System.out.println(triangle);

        /* матрицы */
        Matrix matrix1 = new Matrix(2,3);
        Matrix matrix2 = new Matrix(2,3);

        matrix1.setElement(0,0,1);
        matrix2.setElement(0,0,1);
        System.out.println("матрица 1:");
        matrix1.print();
        System.out.println("матрица 2:");
        matrix2.print();

        Matrix sumMatrix = matrix1.add(matrix2);

        System.out.println("сложение матриц:");
        sumMatrix.print();
    }
}

