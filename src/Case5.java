/*Создайте программу, которая будет генерировать и выводить на экран
вещественное псевдослучайное число из промежутка [-3;3)*/

public class Case5 {
    public static void main(String[] args) {
        double a = (double)Math.random() * 6 - 3;
        System.out.println("Случайное число из отрезка -3,3 равно " + a);
    }
}
