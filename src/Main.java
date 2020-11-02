import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter your command:\n");
            Scanner scanner = new Scanner(System.in);
            String command = scanner.nextLine();
            if (command.equals("calc")) {
                String exp = scanner.nextLine();
                float result = Calculator.ComputeExpression(exp);
                System.out.println(result);
            }
        }
    }
}
