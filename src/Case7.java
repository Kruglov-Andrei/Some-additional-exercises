/*В переменные a и b записаны целые числа, при этом b больше a.
Создайте программу, которая будет генерировать и выводить на экран целое псевдослучайное число из отрезка [a;b]*/

public class Case7 {
    public static void main(String[] args) {
        int a = 8;
        int b = 20;
        int c = (int)(Math.random() * (b - a) + 1) + a;
        if (a > b){
            System.out.println("Условие не верно");
        }
        else {
            System.out.println("Случайное число из отрезка " + a + ", " + b + " равно " + c);
        }
    }
}

//    int a=6;
//    int b=8;
//    int c=(int)(Math.random()*(b-a)+1)+a;
//    System.out.println("Случайное число из отрезка "+a+","+b+" равно " +c);
//            }
//            }