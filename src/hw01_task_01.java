//Вычислить n-ое треугольного число(сумма чисел от 1 до n)

import java.util.Scanner;

public class hw01_task_01 {
    public static void main(String[] args) {

//        System.out.println(input_numb());
//        System.out.println(triangular_number(input_numb()));
//        System.out.println(triangular_number());
//        System.out.println(triangular_number(n));
//        System.out.println(init());

    }


    public static void input_numb() {
        System.out.print("Введите число 'n': ");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        if (n < 0) {
            System.out.println("Ой! Вы случайно ввели отрицательное число " + n + " , так не будет произведён расчёт, но это не страшно!");
            n *= -1;
            System.out.println("Всё исправлено за вас!");
        } else if (n == 0) {
            System.out.println("Ой! Вы случайно ввели Н-И-Ч-Т-О, НОЛЬ, дырку от бублика!");
            System.out.println("Сейчас вас вернёт на начальную точку!");
            input_numb();
        }
//        System.out.println(triangular_number(n));
//        return n;
    }

    public static void triangular_number(int n) {
//        input_numb();
        int summ = 0;
        for (int i = 1; i <= n; i++) {
            summ += i;
//            System.out.println(summ);
        }
        System.out.print("\nОТВЕТ: ");
        System.out.print(n + "м числом треугольного числа является число " + summ);
//        return "";
    }
}