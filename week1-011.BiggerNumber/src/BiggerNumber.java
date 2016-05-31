
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.println("Type a number: ");
        int f = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int s = Integer.parseInt(reader.nextLine());
        
        if (f < s) {
            int t = f;
            f = s;
            s = t;
        }
        System.out.println("The bigger number of the two numbers given was: "+f);
        
    }
}
//Create a program that asks the user for two integers and then prints the larger of the two.
////
////Tip: When you write Math. (that is, Math followed by a dot) in NetBeans, it shows you a bunch of available mathematical calculations. For example, Math.cos(10) calculates the cosine of the number 10. Try to find a suitable tool in Math to complete this exercise! If you cannot find anything suitable or do not know how to complete the exercise, skip the exercise for now. We will return to the matter later on.
////
////Type a number: 20
////Type another number: 14
////
////The bigger number of the two numbers given was: 20
        