import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter your first number");
        float firstNumber = read.nextFloat();

        System.out.println("Enter your second number");
        float secondNumber = read.nextFloat();
        
        System.out.println("Select which operator you want to use");
        System.out.println("1. Addition (+)");
        System.out.println("2. Minus (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        char operator = read.next().charAt(0);

        float result = 0;

        if (operator == '+') {
            result = firstNumber + secondNumber;
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
        } else if (operator == '*') {
            result = firstNumber * secondNumber;
        } else if (operator == '/') {
            result = firstNumber / secondNumber;
        } else {
            System.out.println("Invalid operator");
        }
        
        System.out.println(result);

        System.out.println("Would you like to do more operations? (Y/N)");
        String userAnswer = read.next();

        do {
            System.out.println("Enter your additional number");
            float AditionalNumber = read.nextFloat();

            System.out.println("Select which operator you want to use");
            System.out.println("1. Addition (+)");
            System.out.println("2. Minus (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            operator = read.next().charAt(0);

            if (operator == '+') {
                result = result + AditionalNumber;
            } else if (operator == '-') {
                result = result - AditionalNumber;
            } else if (operator == '*') {
                result = result * AditionalNumber;
            } else if (operator == '/') {
                result = result / AditionalNumber;
            } else {
                System.out.println("Invalid operator");
            }

            System.out.println(result);

            System.out.println("Would you like to do more operations? (Y/N)");
            userAnswer = read.next();
        }  while (userAnswer == "Y");

        read.close();
    }
}