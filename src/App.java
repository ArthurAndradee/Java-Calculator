import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter your first number");
        float firstNumber = read.nextFloat();

        System.out.println("Enter your first number");
        float secondNumber = read.nextFloat();
        
        System.out.println("Select which operator you want to use");
        System.out.println("Addition (+)");
        System.out.println("Minus (-)");
        System.out.println("Multiplication (*)");
        System.out.println("Division (/)");

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

        char userContinue = read.next().charAt(0);

        while (userContinue == 'Y') {
          System.out.println("Select which operator you want to use");
          System.out.println("Addition (+)");
          System.out.println("Minus (-)");
          System.out.println("Multiplication (*)");
          System.out.println("Division (/)");

          float aditionalNumber = read.nextFloat();

          operator = read.next().charAt(0);

          if (operator == '+') {
               result = result + secondNumber;
  
          } else if (operator == '-') {
               result = firstNumber - secondNumber;
  
          } else if (operator == '*') {
               result = firstNumber * secondNumber;
  
          } else if (operator == '/') {
               result = firstNumber / secondNumber;
  
          } else {
              System.out.println("Invalid operator");
          }
        }

        System.out.println(result);

        read.close();
    }
}