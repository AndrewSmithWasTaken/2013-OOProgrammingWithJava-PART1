import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random randomer = new Random();
    private final int size = 7;
    private final int limit = 39;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>(size);
        int nummy = 0;
        for (int i = 0; i < size; i++) {
            nummy = randomer.nextInt(limit) +1;
            if (containsNumber(nummy)) {
                i--;
            }  
            else { 
                numbers.add(nummy);
            }
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
