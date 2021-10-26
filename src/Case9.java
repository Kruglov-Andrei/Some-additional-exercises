/*Создать программу, проверяющую и сообщающую на экран,
является ли целое число записанное в переменную n, чётным либо нечётным.*/

import java.util.Scanner;

public class Case9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Введите целое число:");
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println("Число " + n + " - чётное");
            } else {
                System.out.println("Число " + n + " - нечётное");
            }
        }
    }
}