package W3_state;

public class IntermediateState extends State {
    public IntermediateState(Character c) {
        super(c);
    }

    @Override
    public void action() {
        Character c = getCharacter();
        c.printStatus();

        String[] options = {"Train", "Meditate"};

        if (c.getInput(options) == 1) {
            c.train();
            if (c.getExp() > 100){
                System.out.println("%s/100 EXP! CONGRATULATIONS! next level");
            }
        }

        if (c.getInput(options) == 2) {
            c.meditate();
        }
    }

    @Override
    public String toString() {
        return "Intermediate";
    }
}
