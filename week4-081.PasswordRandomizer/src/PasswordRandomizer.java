import java.util.Random;
import java.util.ArrayList;
        
public class PasswordRandomizer {
    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        char[] word = new char[length];
        for (int i = 0; i < length; i++) {
            word[i] = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
        }
        return new String(word);
    }
}
