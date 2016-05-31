
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word:");
        String w1 = reader.nextLine();
        System.out.println("Type the second word:");
        String w2 = reader.nextLine();
        if (w1.indexOf(w2) != -1) {
            System.out.println("The word "+w2+" is found in the word "+w1);
        }
        else {
            System.out.println("The word "+w2+" is not found in the word "+w1);
        }
    }
}

//Create a program that asks the user for two words. Then the program tells if 
//the second word is included in the first word. Use String method indexOf in 
//your program.
//
//Type the first word: glitter
//Type the second word: litter
//The word 'litter' is found in the word 'glitter'.
//    
//Type the first word: glitter
//Type the second word: clean
//The word 'clean' is not found in the word 'glitter'.
//    
//Note: Make your program outputs (prints) match exactly the example above!