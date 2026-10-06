import java.util.Scanner;

public class MadLibGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter a place: ");
        String place = scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter time: ");
        double time = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.print("Are you a girl? (true/false): ");
        boolean isGender = scanner.nextBoolean();

        String bg = "";
        if (isGender) {
            bg = "she";
        } else {
            bg = "he";
        }

        System.out.println("After working for " + number + " hours at " + place + ", " +
                name + " finally done. On first morning of holiday, " + bg + " woke up at " +
                time + " and realized " + bg + " didn't have to " + verb + " to work.");

        scanner.close();
    }
}