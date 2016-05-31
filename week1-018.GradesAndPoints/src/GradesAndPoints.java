
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Type the points [0-60]:");
        int c = Integer.parseInt(lukija.nextLine());
        if (c < 30) {
            System.out.println("Grade: failed");
        } else if (c > 29 && c < 35 ) {
            System.out.println("Grade: 1");
        } else if (c >34 && c < 40) {
            System.out.println("Grade: 2");
        } else if (c > 39 && c < 45) {
            System.out.println("Grade: 3");
        } else if (c > 44 && c < 50) {
            System.out.println("Grade: 4");
        } else {
            System.out.println("Grade: 5");
        }

    }
}
