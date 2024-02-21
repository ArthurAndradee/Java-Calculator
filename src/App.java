import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter your first number");
        float firstNumber = read.nextFloat();

        System.out.println("Enter your first number");
        float secondNumber = read.nextFloat();
        
        System.out.println("Select which operator you want to use");
        System.out.println("1. Addition (+)");
        System.out.println("2. Minus (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        char operator = read.next().charAt(0);

        if (operator == '+') {
            float result = firstNumber + secondNumber;
            System.out.println(result);
        } else if (operator == '-') {
            float result = firstNumber - secondNumber;
            System.out.println(result);
        } else if (operator == '*') {
            float result = firstNumber * secondNumber;
            System.out.println(result);
        } else if (operator == '/') {
            float result = firstNumber / secondNumber;
            System.out.println(result);
        } else {
            System.out.println("Invalid operator");
        }

        read.close();
    }
}