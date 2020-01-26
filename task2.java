import java.util.Scanner;

public class task2 {
    public static void currentAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your Birth year : ");
        boolean isAnInt = scanner.hasNextInt();
        if(isAnInt){
            int yearOfBirth = scanner.nextInt();
            System.out.println("Enter current year : ");
            int currentYear = scanner.nextInt();
            int age = currentYear-yearOfBirth;
            if(age>=0 && age<=100){
                System.out.println(" your current age is :  "+age);
            }
            else {
                System.out.println("invalid year of Birth");
            }
        }
        else {
            System.out.println("Invalid Input");
        }
        scanner.close();
    }
}
