import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Type the first number:");
        int numOne = Integer.parseInt(lukija.nextLine());
        System.out.println("Type the second number:");
        int numTwo = Integer.parseInt(lukija.nextLine());
        
        if (numOne > numTwo) {
            System.out.println("Greater number: " + numOne);
        } else if (numTwo > numOne) {
            System.out.println("Greater number: " + numTwo);
        } else {
            System.out.println("The numbers are equal!");
        }

    }
}
