package W3_template_method;

import static W3_template_method.ScannerReader.promptInt;

public class Main {
    public static void main(String[] args) {
        DiceGame dGame = new DiceGame();
        String prompt = "Choose the amount of players: ";
        int choice = promptInt(prompt);
        dGame.play(choice);
    }
}
