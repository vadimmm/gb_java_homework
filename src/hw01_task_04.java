import java.util.InputMismatchException;
import java.util.Scanner;

//Реализовать простой калькулятор ("введите первое число"... "Введите второе число"... "
// укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")
public class hw01_task_04 {
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
        Calculate();
    }

    public static void ShowTaskDescription() {
        String task = "//Реализовать простой калькулятор (\"введите первое число\"... \"Введите второе число\"... \"\n" +
                "// укажите операцию, которую надо выполнить с этими числами\"... \"ответ: ...\")";
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
        String calculateAction;

        System.out.print("Пожалуйста, введите действие [+ - * /]: ");
        calculateAction = str.next();

        return calculateAction;
    }

    public static void Calculate() {
        double a = GetIntNumb();
        String action = GetIntString();
        double b = GetIntNumb();
        double result = 0;

        switch (action){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }

        String color = "";
        if (result < 0){
            color = ANSI_RED_BACKGROUND;
        } else if (result == 0){
            color = ANSI_YELLOW;
        } else {
            color = ANSI_GREEN_BACKGROUND;
        }

        String calcResult = (a + " " + action + " " + b  + " = " + color + " " + result + " " + ANSI_RESET);
        System.out.println("\nОТВЕТ: " + calcResult);
    }
}