import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        NumberStatistics sumAll = new NumberStatistics();
        NumberStatistics sumEven = new NumberStatistics();
        NumberStatistics sumOdd = new NumberStatistics();
        
        System.out.println("Type numbers:");
        
        while (true) {
            int parsedInt = Integer.parseInt(reader.nextLine());
            if (parsedInt == -1) {
                break;
            }
            else {
                sumAll.addNumber(parsedInt);
                if (parsedInt % 2 == 0) {
                    sumEven.addNumber(parsedInt);
                }
                else sumOdd.addNumber(parsedInt);
            }
        }
        System.out.println("sum: " + sumAll.sum());
        System.out.println("sum of even: " + sumEven.sum());
        System.out.println("sum of odd: " + sumOdd.sum());
    }
}
