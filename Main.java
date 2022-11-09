package calc;

import java.util.Scanner;

public class Main {
    public static String calc(String input) {
        OperationDefinition operationDefinition = new OperationDefinition();
        String operation = operationDefinition.getOperation(input);
        String symbolForSplit = "[" + operation + "]";
        String[] strings = input.toUpperCase().split(symbolForSplit);
        int a = 0, b = 0;
        boolean flag = true;
        ArabianRomanCheck check = new ArabianRomanCheck();
        flag = check.romanCheck(strings[0], strings[1]);
        VariableValue value = new VariableValue();
        a = value.getVariableValue(strings[0]);
        b = value.getVariableValue(strings[1]);
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        int result = arithmeticOperation.getResult(operation, a, b);
        String stringResult = "";
        if (!flag) {
            RomanResult romanResult = new RomanResult();
            stringResult = romanResult.getRomanResult(result);
        } else {
            stringResult = "" + result;
        }
        return stringResult;
    }

    public static void main(String[] args) {
        System.out.println(" _____________________________________________");
        System.out.println("| Input number, operation and second number   |");
        System.out.println("| Example: a + b, a - b, a * b, a / b         |");
        System.out.println("| Both numbers are arabian only or roman only |");
        System.out.println(" _____________________________________________");
        Scanner scanner = new Scanner(System.in);
        System.out.println(calc(scanner.nextLine()));
        scanner.close();
    }
}
