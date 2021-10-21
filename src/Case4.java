/*В переменных q и w хранятся два натуральных числа.
Создайте программу, выводящую на экран результат деления q на w с остатком.*/

public class Case4 {
    public static void main(String[] args) {
        int q = 56;
        int w = 18;
        int x = q / w;
        int y = q % w;
        System.out.println("Результат деления переменных = " + x);
        System.out.println("Остаток от деления переменных = " + y);
//        System.out.println("Результат деления переменных = " + ((int)(q / w)));
//        System.out.println("Остаток от деления переменных = " + (q % w));
    }
}
