
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Type a number:");
        int l = Integer.parseInt(lukija.nextLine());
        if ( l % 2 == 0) {
            System.out.println("Number " + l + " is even.");
        } else {
            System.out.println("Number " + l + " is odd.");
        }

    }
}
