public class CommandLineCalculator {
    public static void main(String[] args) {
        // Check if the correct number of command line arguments is provided
        if (args.length != 3) {
            System.out.println("Usage: java CommandLineCalculator <number1> <operator> <number2>");
            System.exit(1); // Exit with an error code
        }

        // Parse the command line arguments
        double num1 = Double.parseDouble(args[0]);
        String operator = args[1];
        double num2 = Double.parseDouble(args[2]);

        // Perform the calculation based on the operator
        double result = 0.0;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                // Check for division by zero
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    System.exit(1); // Exit with an error code
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                System.exit(1); // Exit with an error code
        }

        // Display the result
        System.out.println("Result: " + result);
    }
}
