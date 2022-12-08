//Вывести все простые числа от 1 до 1000
// (простые числа - это числа, которые делятся только на себя и на единицу без остатка.
// Чтобы найти остаток от деления, используйте оператор %, например 10%3 будет равно единице)

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw01_task_03 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_REVERSE = "\033[7m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static void main(String[] args) {
        ShowTaskDescription();
        PrimeNumbers(1, GetIntNumb());
//        EasyNumbers(1, 1000);
    }

    public static void ShowTaskDescription() {
        String task = "Вывести все простые числа от 1 до 1000\n" +
                "(простые числа - это числа, которые делятся только на себя и на единицу без остатка.\n" +
                "Чтобы найти остаток от деления, используйте оператор %, например 10%3 будет равно единице)";
        String line = (ANSI_REVERSE + ' ' + ANSI_RESET).repeat(120);
        System.out.println(line);
        System.out.println("\n\t" + ANSI_YELLOW + task + ANSI_RESET + "\n");
        System.out.println(line);
    }
    public static int GetIntNumb() {
        Scanner numb = new Scanner(System.in);
        int number;
        while(true) {
            try {
                System.out.print("Пожалуйста, введите положительное число: ");
                number = numb.nextInt();
                if(number <= 0) {
                    throw new InputMismatchException();
                }
                break;
            }
            catch(InputMismatchException e) {
                System.out.println(ANSI_RED + "Ой! Ошибка ввода! Попробуйте снова!" + ANSI_RESET);
                numb.nextLine();
            }
        }
        return number;
    }
    public static void PrimeNumbers(int a, int b){
        System.out.println("\nОТВЕТ: ");
        for (int i = 2; i <= b; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2){
                System.out.println(i);
            }
        }
    }
}