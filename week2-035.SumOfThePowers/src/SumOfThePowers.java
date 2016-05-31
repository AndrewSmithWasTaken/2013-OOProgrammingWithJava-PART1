
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number:");
        int x = Integer.parseInt(reader.nextLine());
        int r = 0;
        
        for (int i = 0; i <= x; i++) {
            r += (int)Math.pow(2, i);
        }
        System.out.println("The result is "+r);
    }
}
