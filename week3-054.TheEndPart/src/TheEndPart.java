import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word:");
        String word = reader.nextLine();
        System.out.println("Length of the end part:");
        System.out.println("Result: "+word.substring((word.length())-(Integer.parseInt(reader.nextLine()))));
    }
}

//Create a program that prints the end part of a word. The program 
//asks the user for the word and the length of the end part. Use the 
//substring method in your program.
//
//Type a word: example
//Length of the end part: 4
//Result: mple
//    
//Type a word: example
//Length of the end part: 6
//Result: xample

//0,1,2,3,4,5,6,7,8