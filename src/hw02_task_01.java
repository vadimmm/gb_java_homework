
import java.util.Scanner;
import java.util.*;
public class hw02_task_01 {

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
        String task = "Используем наш код который мы писали на семинаре и дорабатываем, нужно сделать так что бы мы могли написать формулу и заполненить все элементов которые сами же и вели\n" +
                "Например\n" +
                "a + b + c\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "ответ 9";
        String line = (ANSI_REVERSE + ' ' + ANSI_RESET).repeat(120);
        System.out.println(line);
        System.out.println("\n\t" + ANSI_YELLOW + task + ANSI_RESET + "\n");
        System.out.println(line);
    }

    public static String GetString() {
        Scanner str = new Scanner(System.in);
        String equation;
        System.out.print("Введите формулу для расчёта: ");
        equation = str.nextLine();
        return equation;

    }
    public static void Equation() {
        Map<String, Integer> states = new HashMap<String, Integer>();
        states.put("0", 0);
        Scanner str = new Scanner(System.in);
        // a + b + c + d + c
        String equation = GetString();
        equation = String.format(equation).replace(" ","");
        String[] st1 = equation.split("\\+");
        int sum = 0;
        for (int i = 0; i < st1.length; i++ )
        {
            for(Map.Entry<String, Integer> item : states.entrySet()){
                if(item.getKey() != st1[i]){
                    states.put(st1[i], str.nextInt());
                    break;
                }
            }
        }
        for(Map.Entry<String, Integer> item : states.entrySet()){
            sum += item.getValue();
        }
        System.out.println("ОТВЕТ: " + sum);
    }
}
