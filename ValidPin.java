import java.util.Scanner;

public class ValidPin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the PIN number: ");
        String pin = scanner.nextLine();

        if (pin.matches("\\d{3} \\d{3}")) {
            System.out.println("Valid PIN number");
        } else {
            System.out.println("Invalid PIN number");
        }
    }
}
