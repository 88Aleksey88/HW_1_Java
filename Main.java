package org.example;

/*
Задание

        1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        2) Вывести все простые числа от 1 до 1000
        3) Реализовать простой калькулятор
        4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
        Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
        Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
 */
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Task1();
        // Task2();
        // Task3();
        }
    static void Task1 (){
        Scanner iScanner =new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = iScanner.nextInt();
        System.out.printf("Треугольное число: %d", (n*(n+1))/2);
    }
    static void Task2 (){
        for (int i = 1; i <= 1000; i++){
            boolean isSimple = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    isSimple = false;
                }
            }
            if (isSimple) System.out.printf("%d ", i);
        }
    }
    static void Task3(){
        Scanner iScanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float a = iScanner.nextFloat();
        System.out.println("Введите второе число: ");
        float b= iScanner.nextFloat();
        System.out.println("Введите математическую операцию: ");
        String operation = scan.nextLine();
        if (operation.equals("+")) System.out.println(a+b);
        else if (operation.equals("-")) System.out.println(a-b);
        else if (operation.equals("*")) System.out.println(a*b);
        else if (operation.equals("/")) System.out.println(a/b);
    }
}