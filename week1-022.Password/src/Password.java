
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Toteuta ohjelmasi tähän
        while (true) {
            System.out.print("Type the password: ");
            String c = reader.nextLine();
            if (c.equals(password)) {
                System.out.println("Right!");
                break;
            }  
            System.out.println("Wrong!");
        }    
        System.out.println("GYUhjj tyRR");
    }
}
