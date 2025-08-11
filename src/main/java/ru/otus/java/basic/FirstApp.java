package ru.otus.java.basic;

//Клас в UpperCamelCase
public class FirstApp {
    //    Точка входа в приложение
    public static void main(String[] args) {
//        System.out.println("Hello world!!");
/*
        System.out.println("-----");
        System.out.println("-   -");
        System.out.println("-----");
*/

//        System.out.println(1);

//        Переменные в lowerCamelCase
//        Объявление без значения
//        int a;
//        a = 10;

//        Объявление и сразу передаем значение
//        int a = 8;
//        System.out.println(a);

//        int a = 1;
//        a ++;
//        System.out.println(a);
//        a += 10;
//        System.out.println(a);
//        a /= 6;
//        System.out.println(a);

//        int b = 100;
//        int result = a + b;
//        System.out.println("a = " + a +", b = " + b + ", sum = " + result);

//        float a = 11;
//        a /= 3;
//        System.out.println(a);

//        Вызов метода
//        drawSquare();
//        drawSquare();
//        drawSquare();

//        Условия
        int temp = 35;
        if (temp > 28) {
            System.out.println("Надень футболку");
        } else if (temp <= 28 && temp > 10) {
            System.out.println("Надень куртку");
        } else {
            System.out.println("Надень теплую куртку");
        }
    }

    //    Отдельный метод регистрируется в классе
    public static void drawSquare() {
        System.out.println("-----");
        System.out.println("-   -");
        System.out.println("-   -");
        System.out.println("-----");
//        Внутри метода так же можно вызвать другой метод
    }
}
