
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.println("Kuinka vanha olet?");
        int age = Integer.parseInt(lukija.nextLine());
        
        if (age < 18) {
            System.out.println("You have not reached the age of majority yet!");
        } else {
            System.out.println("You have reached the age of majority!");
        }
    }
}
