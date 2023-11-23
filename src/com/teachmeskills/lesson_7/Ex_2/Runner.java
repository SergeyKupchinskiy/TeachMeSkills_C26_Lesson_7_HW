package com.teachmeskills.lesson_7.Ex_2;
/*
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя абстрактный класс/методы).
Создать массив из 5 разных фигур.
Пройтись циклом по массиву и вывести информацию о каждой фигуре.
Вывести на экран сумму периметров всех фигур в массиве.
 */

public class Runner {
    public static void main(String[] args) {

        Figure[] fiveFigures = new Figure[5];
        fiveFigures[0] = new Circle(12);
        fiveFigures[1] = new Rectangle(3,7);
        fiveFigures[2] = new Triangle(3,4,5);
        fiveFigures[3] = new Circle(2);
        fiveFigures[4] = new Triangle(5,6,9);

        double sumOfPerimeters = 0;
        int i = 1;

        for (Figure array : fiveFigures){
            System.out.println("Perimeter of the given figure № " + i + " = " + array.calculateThePerimeter());
            System.out.println("Area of the given figure № " + i + " = " + array.calculateTheArea() +"\n");
            i++;
            sumOfPerimeters += array.calculateThePerimeter();
        }

        System.out.println("\nThe sum of the perimeters of all five given figures = " + sumOfPerimeters);
    }
}
