package W2_decorator;

public class IntroductionPrinter extends BasicPrinter {
    public IntroductionPrinter(Printer wrappee) {
        super(wrappee);
    }

    @Override
    public void print(String s){
        wrappee.print("hello" + s);
    }
}
