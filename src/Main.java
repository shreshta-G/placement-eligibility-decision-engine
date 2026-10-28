import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your percentage: ");
        double percentage = scanner.nextDouble();
        System.out.println("Enter your backlogs: ");
        int backlogs = scanner.nextInt();
        System.out.println("Enter your graduation year: ");
        int graduationYear = scanner.nextInt();

        System.out.println("Candidate: " + name);
        System.out.println("Percentage: " + percentage);
        System.out.println("Backlogs: " + backlogs);
        System.out.println("Graduation Year: " + graduationYear);

        scanner.close();
    }
}