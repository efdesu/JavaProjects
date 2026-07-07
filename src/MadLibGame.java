import java.util.Scanner;

public class MadLibGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("It was a/an ... November day.");
        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();


        System.out.println("I woke up at ... a.m.");
        System.out.print("Enter the time: ");
        double time = scanner.nextDouble();


        System.out.println("I ate ... egg(s)");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        System.out.print("Am I a human? (true/false): ");
        boolean isHuman = scanner.nextBoolean();

        String kind = "";


        if(isHuman){
            kind = "human";
        } else {
            System.out.println("I am a ... .");
            System.out.print("Enter a kind: ");
            scanner.nextLine();
            kind = scanner.nextLine();
        }

        System.out.println(" ");

        System.out.println("It was a/an " + adjective + " November day.");
        System.out.println("I woke up at " + time + " a.m.");
        System.out.println("I ate " + number + " egg(s).");
        System.out.println("I am a " + kind);

        scanner.close();







    }
}
