/*В переменной n хранится натуральное двузначное число.
Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n...*/

public class Case3 {
    public static void main(String[] args) {
      int a = 69;
      int x = ((a / 10) % 10);
      int y = (a % 10);
        System.out.println("Первая цифра числа а = " + x);
        System.out.println("Вторая цифра числа а = " + y);
        System.out.println("Сумма цифр числа а = " + (x + y));
    }
    }
