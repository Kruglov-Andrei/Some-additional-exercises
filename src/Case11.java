/*Создать программу, которая будет проверять попало ли случайно выбранное
из отрезка [5;155] целое число в интервал (25;100) и сообщать результат на экран.
1. Получим число из заданного интервала с помощью функции Math.random;
2. С помощью оператором if-else зададим условия для вывода на экран соответсвующей строки.
*/

public class Case11 {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 150 + 1) + 5;
        System.out.println("Случайное число: " + a);
        if (a <= 25 || a >= 100){
            System.out.println("Число " + a + " не содержится в интервале 25 - 100");
        }
        else {
            System.out.println("Число " + a + " содержится в интервале 25 - 100");
        }
    }
}
