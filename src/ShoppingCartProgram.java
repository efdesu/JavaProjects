import java.util.Scanner;
public class ShoppingCartProgram {
    public static void main(String[] args){
        Scanner inp = new Scanner (System.in); // same as Scanner scanner or Scanner input

        System.out.print("What food would you like to buy?: ");
        String food = inp.nextLine();

        System.out.print("What is the price for each?: ");
        double price = inp.nextDouble();

        System.out.print("How many would you like?: ");
        int amount = inp.nextInt();

        System.out.println("You have bought " + amount + food + ".");
        System.out.println("Your total is $"  + (amount*price) + "."); //don't forget parentheses for order of operations

        inp.close(); //don't forget






    }
}
