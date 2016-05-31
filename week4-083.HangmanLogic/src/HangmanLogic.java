public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (guessedLetters.contains(letter)) {
            return;
        } 
        if (!word.contains(letter)) {
            numberOfFaults++;
        }
        guessedLetters += letter;
    }

    public String hiddenWord() {
        String hiddenWord = "";
        for (int i = 0; i < word.length(); i++) {
            String wordLetter = word.substring(i,i+1);//String.valueOf(word.charAt(i));//"" + word.charAt(i);
            if (guessedLetters.contains(wordLetter)) {
                hiddenWord += word.charAt(i);
            }
            else {
                hiddenWord += '_';
            }
        }
        return hiddenWord;
    }
}
