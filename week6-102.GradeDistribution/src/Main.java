import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grading grading = new Grading(scanner);
        
        grading.getResults();
        grading.countGrades();
        grading.printGrades();
    }
}
