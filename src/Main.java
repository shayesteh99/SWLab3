import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Clipboard clipboard = new Clipboard();
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
            else if (command.equals("add")) {
                String s = scanner.nextLine();
                clipboard.addToClipboard(s);
            }
            else if (command.equals("checkContains")) {
                String s = scanner.nextLine();
                boolean result = clipboard.checkInClipboard(s);
                if (result)
                    System.out.println("Yes");
                else
                    System.out.println("NO");
            }
            else if (command.equals("remove")) {
                String s = scanner.nextLine();
                clipboard.removeFromClipboard(s);
            }
            else if (command.equals("reset")) {
                clipboard.resetClipboard();
            }
            else {
                System.out.println("Wrong command!");
            }
        }
    }
}
