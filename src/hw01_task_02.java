//Вычислить n! (произведение чисел от 1 до n)

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw01_task_02 {
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
        ProductOfNumbers(GetIntNumb());
    }

    public static void ShowTaskDescription(){
        String task = "Вычислить n! (произведение чисел от 1 до n)";
        String line = (ANSI_REVERSE + ' ' + ANSI_RESET).repeat(120);
        System.out.println(line);
        System.out.println("\n\t" + ANSI_YELLOW + task + ANSI_RESET +  "\n");
        System.out.println(line);
    }

    public static int GetIntNumb() {
        Scanner numb = new Scanner(System.in);
        int number;
        while(true) {
            try {
                System.out.print("Пожалуйста, введите положительное число 'n': ");
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

    public static String ProductOfNumbers(int n){
        int result = 1;
        for (int i = 1; i <= n ; i++) {
            result *= i;
//            System.out.println(result);
        }
        System.out.print("\nОТВЕТ: ");
        System.out.print("Произведение чисел от 1 до "+ n + " составляет " + result);
        return "";
    }
}
