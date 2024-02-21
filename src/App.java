import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Enter your first grade");
        float firstGrade = read.nextFloat();  // Read user input

        System.out.println("Enter your second grade");
        float secondGrade = read.nextFloat();

        float result = firstGrade + secondGrade;
        float division = result / 2;
        System.out.printf("Result is: %f", division);  // Output user input

        //testing git
        
        read.close();
    }
}
