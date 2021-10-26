/*Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное число
 и его наибольшую цифру.
1. В этом примере для генерации псевдослучайного числа используем новый класс Random из библиотеки java.util.
Сначала загрузим эту библиотеку;
2. Создадим объект класса Random;
3. Сгенерируем трехзначное число;
4. С помощью уже знакомого деления по модулю получим значения всех цифр заданного трехзначного числа и занесем их значения в переменные;
5. С помощью операторов if-else сравним полученные числа и выведем большее.*/

import java.util.Random;

public class Case12 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int a = (int)rnd.nextInt(899) + 100;
        int b = a % 10;
        int c=(a/10)%10;
        int d=(a/100)%10;
        if(b>=c&b>d||b>c&b>=d){
            System.out.println("В числе "+a+" наибольшая цифра " +b);
        }
        else {
            if (c>b&c>=d) {
                System.out.println("В числе "+a+" наибольшая цифра " +c);
            }
            else {
                System.out.println("В числе "+a+" наибольшая цифра " +d);
            }
        }
    }
}
