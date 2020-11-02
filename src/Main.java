import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter your command:\n");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            if (command.equals("exit")) {
                return;
            }
            else if (command.equals("calc")) {
                String exp = scanner.nextLine();
                float result = Calculator.ComputeExpression(exp);
                System.out.println(result);
            }
            else if (command.equals("date")) {
                String result = DateAndTime.getCurrentDate();
                System.out.println(result);
            }
            else if (command.equals("time")) {
                String result = DateAndTime.getCurrentTime();
                System.out.println(result);
            }
            else if (command.equals("random")) {
                float result = Calculator.generateRandom();
                System.out.println(result);
            }
            else {
                System.out.println("Wrong command!");
            }
        }
    }
}
