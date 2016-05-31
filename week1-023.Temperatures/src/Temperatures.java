
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        // Toteuta lämpötilaohjelma tähän.
        
        while (true) {
            System.out.println("Enter a temperature: ");
            double luku = Double.parseDouble(lukija.nextLine());
            if (luku < 40 && luku > -30) {
                Graph.addNumber(luku);
            }   
            if (luku < -1000) {
                break;
            }
        }
    }
}