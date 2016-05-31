import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int e = 0;
        int o = 0;
        
        System.out.println("Type numbers:");
        while (true) {
            int x = Integer.parseInt(reader.nextLine());
            if (x != -1) {
                sum +=  x;
                count++;
                if (x%2 == 0){
                    e += 1;
                }
                else {
                    o += 1;
                }
            }
            else {
                System.out.println("Thank you and see you later!");
                break;
            }
        }
        System.out.println("The sum is "+sum);
        System.out.println("How many numbers: "+count);
        System.out.println("Average: "+((double)sum/count));
        System.out.println("Even numbers: "+e);
        System.out.println("Odd numbers: "+o);
    }
}
