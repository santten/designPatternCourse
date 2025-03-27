package W2_decorator;

public class XMLPrinter extends BasicPrinter {
    public XMLPrinter(Printer wrappee) {
        super(wrappee);
    }

    @Override
    public void print(String s){
        wrappee.print("<message>" + s + "</message>");
    }
}
