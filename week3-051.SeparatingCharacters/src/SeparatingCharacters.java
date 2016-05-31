
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        int l = name.length();
        int m = 0;
            if (name.length() > 0) {
                while (m < l) {
                    System.out.println(m+1+". character: "+name.charAt(m));
                    m++;
                }
            }
    }
}
