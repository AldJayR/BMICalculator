
import java.util.Scanner;

public class TextInterface {

    private Scanner scanner;

    public TextInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("======BMI Calculator========");
            System.out.println("\tStart");
            getBMI();
            System.out.print("Calculate again? (Yes/No) ");
            String prompt = scanner.nextLine();

            if (prompt.equalsIgnoreCase("no")) {
                break;
            }

        }
    }

    private void getBMI() {
        System.out.print("Enter weight (kg): ");
        double weight = Double.valueOf(scanner.nextLine());
        System.out.print("Enter height (m): ");
        double height = Double.valueOf(scanner.nextLine());
        BMI bmi = new BMI(weight, height);
        System.out.println("\nYour BMI is: " + String.format("%.2f", bmi.calculateBMI()) + "\nCategory: " + bmi.getBMICategory());
    }
}
