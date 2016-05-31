
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.println("Type a number:");
        int luku = Integer.parseInt(lukija.nextLine());
        
        if (luku > 0) {
            System.out.println("The number is positive.");
        } else if (luku <= 0) {
            System.out.println("The number is not positive.");
        }
    }
}



