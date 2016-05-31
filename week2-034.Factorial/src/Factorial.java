import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number:");
        int x = Integer.parseInt(reader.nextLine());
        int f = 1;
        
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        System.out.println("Factorial is "+f);
    }
}
