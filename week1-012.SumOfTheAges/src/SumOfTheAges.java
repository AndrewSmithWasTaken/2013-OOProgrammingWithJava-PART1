
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
        System.out.println("Type your name:");
        String n1 = reader.nextLine();
        System.out.println("Type your age:");
        int a1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type your name:");
        String n2 = reader.nextLine();
        System.out.println("Type your age:");
        int a2 = Integer.parseInt(reader.nextLine());
        int sum = a1 + a2;
        
        System.out.println(n1+" and "+n2+" are "+sum+" years old in total.");
        
        
    }
}

//Create a program that asks for the names and ages of two users. After that the program prints the sum of their ages.
//
//Type your name: Matti
//Type your age: 14
//
//Type your name: Arto
//Type your age: 12
//
//Matti and Arto are 26 years old in total.