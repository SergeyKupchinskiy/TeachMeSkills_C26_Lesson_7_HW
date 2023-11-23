package com.teachmeskills.lesson_7.Ex_1;

import java.util.Scanner;

/*Задача 1:
Создать классы "Директор", "Рабочий", "Бухгалтер".
Реализовать интерфейс с методом, который задает поведения для вывода на экран название должности.
Имплементировать этот метод в созданные классы.
Создать класс-раннер с методом мейн для запуска программы.
Запросить с консоли код должности и вывести название должности на экран.

 */
public class Runner {
    public static void main(String[] args) {
        Director director = new Director("Vladimir","Volkov",200000,"ten years");
        Worker worker = new Worker("Vasiliy","Morozov",40000,"without experience");
        Bookkeeper bookkeeper = new Bookkeeper("Larisa","Lebedeva",90000,"five years");

        System.out.println("Choose the number of your job title");
        System.out.println(" 1.Director \n 2.Worker \n 3.Bookkeeper");
        System.out.println("Please, enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                director.showTitle();
                break;
            case 2:
                worker.showTitle();
                break;
            case 3:
                bookkeeper.showTitle();
                break;
            default:
                System.out.println("There is no job title under this number");
        }

    }

}
