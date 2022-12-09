//*+Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw01_task_05 {
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
        Equation();
    }

    public static void ShowTaskDescription() {
        String task = "*+Задано уравнение вида q + w = e, q, w, e >= 0.\n" +
                "Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.\n" +
                "Требуется восстановить выражение до верного равенства.\n" +
                "Предложить хотя бы одно решение или сообщить, что его нет";
        String line = (ANSI_REVERSE + ' ' + ANSI_RESET).repeat(120);
        System.out.println(line);
        System.out.println("\n\t" + ANSI_YELLOW + task + ANSI_RESET + "\n");
        System.out.println(line);
    }

    public static int GetIntNumb() {
        Scanner numb = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.print("Пожалуйста, введите целое число: ");
                number = numb.nextInt();
                if (number <= 0) {
                    throw new InputMismatchException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println(ANSI_RED + "Ой! Ошибка ввода! Попробуйте снова!" + ANSI_RESET);
                numb.nextLine();
            }
        }
        return number;
    }

    public static String GetIntString() {
        Scanner str = new Scanner(System.in);
        String crashEquation;

        System.out.print("Пожалуйста, введите формулу: ");
        crashEquation = str.next();

        return crashEquation;
    }
    public static void Equation(){
//        String equation = GetIntString();
        String equation = "2? + ?5 = 69";
        equation = String.format(equation).replace(" ", "");
        System.out.println(equation);

        String[] stage_01 = equation.split("\\+");
        String[] stage_02 = stage_01[1].split("=");

        String[] stage_03 = new String[3];
        for (int i = 0; i < stage_03.length; i++) {
            stage_03[0] = stage_01[0];
            stage_03[1] = stage_02[0];
            stage_03[2] = stage_02[1];
        }


//        char[] result = equation.toCharArray();


        for (int i = 0; i < stage_01.length; i++)
            System.out.println("Element stage_01 [" + i + "]: " + stage_01[i]);

        for (int i = 0; i < stage_02.length; i++)
            System.out.println("Element stage_02 [" + i + "]: " + stage_02[i]);

        for (int i = 0; i < stage_03.length; i++)
            System.out.println("Element stage_03 [" + i + "]: " + stage_03[i]);


    }

}
