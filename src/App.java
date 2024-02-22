import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter your first number");
        float firstNumber = read.nextFloat();

        System.out.println("Enter your second number");
        float secondNumber = read.nextFloat();
        
        System.out.println("Select which operator you want to use \nAddition (+)\nMinus (-)\nMultiplication (*)\nDivision (/)");
        char operator = read.next().charAt(0);

        do {
            System.out.println("Invalid operator");
            operator = read.next().charAt(0);
        } while (operator != '+' && operator != '-' && operator != '&' && operator != '/');

        float result = 0;

        if (operator == '+') {
            result = firstNumber + secondNumber;
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
        } else if (operator == '*') {
            result = firstNumber * secondNumber;
        } else if (operator == '/') {
            result = firstNumber / secondNumber;
        }

        System.out.println(result);

        System.out.println("Would you like to do more operations? (Y/N)");
        char userAnswer = read.next().charAt(0);

        do {
            System.out.println("Please insert a valid character: (Y/N)");
            userAnswer = read.next().charAt(0);
        } while (userAnswer != 'Y' && userAnswer != 'N');

        while (userAnswer == 'Y') {
            System.out.println("Enter your additional number");
            float AditionalNumber = read.nextFloat();

            System.out.println("Select which operator you want to use \nAddition (+)\nMinus (-)\nMultiplication (*)\nDivision (/)");
            operator = read.next().charAt(0);

            do {
                System.out.println("Invalid operator");
                operator = read.next().charAt(0);
            } while (operator != '+' && operator != '-' && operator != '&' && operator != '/');

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
                operator = read.next().charAt(0);
            }

            System.out.println(result);

            System.out.println("Would you like to do more operations? (Y/N)");
            userAnswer = read.next().charAt(0);
        } 

        if (userAnswer != 'N') {
            System.out.println("Invalid input");
            userAnswer = read.next().charAt(0);
        }

        read.close();
    }
}