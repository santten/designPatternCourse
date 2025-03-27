package W2_decorator;

public class EncryptedPrinter extends BasicPrinter {
    public EncryptedPrinter(Printer wrappee) {
        super(wrappee);
    }

    public String encrypt(String s) {
        int shift = 3;
        StringBuilder encrypted = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + shift) % 26 + base);
            }
            encrypted.append(c);
        }
        return encrypted.toString();
    }

    public String decrypt(String s) {
        int shift = -3;
        StringBuilder encrypted = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + shift) % 26 + base);
            }
            encrypted.append(c);
        }
        return encrypted.toString();
    }

    @Override
    public void print(String s){
        wrappee.print(encrypt(s));
        // prove decrypt works
        // System.out.print(decrypt(encrypt(s)) + " || " + s);
    }
}
