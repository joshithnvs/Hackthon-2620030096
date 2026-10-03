import java.util.Scanner;

public class Waterbill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read water consumption in litres
        System.out.print("Enter water consumption in litres: ");
        double consumption = scanner.nextDouble();

        double billAmount;

        // Calculate bill based on consumption
        if (consumption <= 500) {
            billAmount = 100;
        } else {
            billAmount = 200;
        }

        // Display the water bill
        System.out.println("Water bill amount: Rs. " + billAmount);

        scanner.close();
    }
}