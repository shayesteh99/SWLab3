public class Calculator {
    public static float ComputeExpression(String exp) {
        String args[] = exp.split(" ");
        float first = Float.parseFloat(args[0]);
        float second = Float.parseFloat(args[2]);
        if (args[1].equals("+")) {
            return first + second;
        }
        if (args[1].equals("-")) {
            return first - second;
        }
        if (args[1].equals("*")) {
            return first * second;
        }
        if (args[1].equals("/")) {
            if (Math.abs(second) < 0.00001)
                return 0;
            return first / second;
        }
        return 0;
    }
}
