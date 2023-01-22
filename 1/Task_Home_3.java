/*Задание 3.

Реализовать простой калькулятор (операции + - / * ) */

import java.util.Scanner;

public class Task_Home_3 {
    public static void main(String[] args) {
    float n1,n2;
    Scanner iScanner = new Scanner(System.in);
    System.out.print("\033\143");
    System.out.print("Задайте число 1 : ");
    n1 = iScanner.nextFloat();
    System.out.print("Задайте число 2 : ");
    n2 = iScanner.nextFloat();;
    System.out.print("Введите операцию: ");
    String operation = iScanner.next();
    float result=0;
    switch (operation) {
        case "+":
        result = n1+n2;
        break;
        case "-":
        result = n1-n2;
        break;
        case "*":
        result = n1*n2;
        break;
        case "/":
        result = n1/n2;
        break;
        default:
        System.out.print("Ошибка ввода операции: ");
        break;
    }
    System.out.printf("%.2f %s %.2f = %f", n1, operation, n2, result);
    iScanner.close();
    }
}