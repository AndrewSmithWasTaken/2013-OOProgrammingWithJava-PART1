
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics() {
        this.amountOfNumbers = 0;
    }
    
    public void addNumber(int number) {
        amountOfNumbers++;
        sum += number;
    }
    
    public int amountOfNumbers() {
        return amountOfNumbers;
    }
    
    public int sum() {
        if (sum == 0) {
            return 0;
        }
        return sum;
    }
    
    public double average() {
        if (sum == 0) {
            return 0;
        }
        return sum / (double)amountOfNumbers;
    }
}
