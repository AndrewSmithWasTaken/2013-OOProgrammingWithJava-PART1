import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String help = "";
        int l = text.length();
        for (int i = l-1; i >= 0; i--)  {
            help = help + text.charAt(i);
        }
        return help.equals(text);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
