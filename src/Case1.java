/*В переменной n хранится натуральное трёхзначное число.
Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.*/

public class Case1 {
    public static void main(String[] args) {
        int a = 569;
        System.out.println("Третья цифра числа а равна " + (a%10));
        System.out.println("Вторая цифра числа а равна " + ((a/10)%10));
        System.out.println("Первая цифра числа а равна " + ((a/100)%10));
        System.out.println("Сумма цифр числа а равна " + ((a%10) + ((a/10)%10) + ((a/100)%10)));
    }
}
