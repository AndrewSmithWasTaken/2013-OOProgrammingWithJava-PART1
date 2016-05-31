
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        String u1 = "alex";
        String u2 = "emily";
        String p1 = "mightyducks";
        String p2 = "cat";
        
        System.out.println("Type your username:");
        String u = lukija.nextLine();
        System.out.println("Type your password:");
        String p = lukija.nextLine();
        
        if ( u.equals(u1) && p.equals(p1) || u.equals(u2) && p.equals(p2) ) {
            System.out.println("You are now logged into the system!");
        } else if ( !u.equals(u1) || !p.equals(p1) || !u.equals(u2) || !p.equals(p2) ) {
            System.out.println("Your username or password was invalid!");
        }

    }
}
