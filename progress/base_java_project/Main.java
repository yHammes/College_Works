import java.util.Scanner;

public class Main {

    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int user_int = scanner.nextInt();

        System.out.print("Please enter a string: ");
        scanner.nextLine();

        String user_string = scanner.nextLine();

        System.out.println("\n--- You Entered ---");
        System.out.println("Integer: " + user_int);
        System.out.println("String: " + user_string);

        scanner.close();

        return;
    }
}
