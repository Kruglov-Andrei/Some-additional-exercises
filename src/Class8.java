/*В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
Вычислить и вывести на экран площадь треугольника и его периметр.
1. Зададим значения катетов в переменные a и b
2. Получим и выведем площадь прямоугольного прямоугольника по формуле S=a*b/2
3. С помощью теоремы Пифагора получим значение гипотенузы в переменную с
4. Посчитаем сумму длин сторон треугольника и выведем результат на экран*/

public class Class8 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.println("Площадь прямоугольного треугольника с катетами "
                + a + " и " + b + " равна " + (a*b)/2);
        double c = Math.sqrt(a*a+b*b);
        System.out.println("Периметр прямоугольного треугольника с катетами "
                + a + " и " + b + " и гипотенузой " + (float)c + " равен " + (float)(a+b+c));
    }
}
//Здесь какие-то изменения