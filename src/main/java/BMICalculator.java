
import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TextInterface textInterface = new TextInterface(scanner);

        textInterface.start();
    }
}
