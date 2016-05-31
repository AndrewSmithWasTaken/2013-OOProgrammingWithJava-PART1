public class Main {

    public static void main(String[] args) {
        HangmanLogic logic = new HangmanLogic("sandbach");
        HangmanUserInterface game = new HangmanUserInterface(logic);
        game.start();
    }
}
