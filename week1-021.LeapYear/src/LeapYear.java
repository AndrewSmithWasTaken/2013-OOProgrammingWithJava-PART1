
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Type a year:");
        double v = Integer.parseInt(lukija.nextLine());
        boolean leap = ((v % 4 == 0) && (v % 100 != 0) || (v % 400 == 0));
        if (leap) {
            System.out.println("That year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

    }
}
