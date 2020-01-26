import java.util.Scanner;

public class task1 {
    public static void greetings(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" First Name");
        String firstName = scanner.nextLine();
        System.out.println(" Last Name");
        String lastName = scanner.nextLine();
        System.out.println(" Hello " + firstName+ " "+lastName + ", Greetings to you !!");

        scanner.close();
    }
}
