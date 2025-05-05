package W7.iterator;

import java.math.BigInteger;
import java.util.Iterator;

public class FibonacciIterator implements Iterator<BigInteger> {
    private final FibonacciSequence sequence;

    public FibonacciIterator(FibonacciSequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public BigInteger next() {
        BigInteger cur = sequence.getCurrent();
        sequence.setPrevious(sequence.getCurrent());
        sequence.setCurrent(sequence.getNext());
        sequence.setNext((sequence.getPrevious()).add(sequence.getCurrent()));
        return cur;
    }
}
