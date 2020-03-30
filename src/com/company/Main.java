package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
      double x, y, z;
      char c;
      Scanner scanner = new Scanner(System.in);
      while (true) {
          System.out.println("!!!Считаю площадь только через стороны!!!");
          System.out.println("Введите номер фигуры");
          System.out.println("1-прямоугольник");
          System.out.println("2-треугольик");
          System.out.println("3-параллелограмм");
          System.out.println("4-трапеция");
          System.out.println("5-ромб");
          System.out.println("6-круг");
          c = scanner.next().charAt(0);
          if(c =='1'){
              System.out.println("сторона 1");
              x = scanner.nextDouble();
              System.out.println("сторона 2");
              y=scanner.nextDouble();
              System.out.println(x*y);
          }
          else if(c == '2'){
              System.out.println("сторона");
              x= scanner.nextDouble();
              System.out.println("высота к стороне");
              y= scanner.nextDouble();
              System.out.println(x*y/2);
          }
          else if(c == '3'){
              System.out.println("сторона");
              x= scanner.nextDouble();
              System.out.println("Высота к стороне");
              y= scanner.nextDouble();
              System.out.println(x*y);
          }
          else if(c == '4'){
              System.out.println("основание ");
              x= scanner.nextDouble();
              System.out.println("основание");
              y= scanner.nextDouble();
              System.out.println("высота");
              z= scanner.nextDouble();
              System.out.println((x+y)*z/2);
          }
          else if(c == '5'){
              System.out.println("диагональ 1");
              x= scanner.nextDouble();
              System.out.println("диагональ 2");
              y= scanner.nextDouble();
              System.out.println(x*y/2);
          }
          else if(c == '6'){
              System.out.println("радиус");
              x= scanner.nextDouble();
              System.out.println(3.14*x*x);
          }
          else{
              System.out.println("В разработке...");
          }
      }
    }
}