package W7.iterator;

import java.math.BigInteger;
import java.util.Iterator;

public class FibonacciSequence implements Sequence {
    BigInteger previous;
    BigInteger next;
    BigInteger current;

    public FibonacciSequence() {
        this.previous = BigInteger.valueOf(0);
        this.current = BigInteger.valueOf(0);
        this.next = BigInteger.valueOf(1);
    }

    @Override
    public Iterator<BigInteger> iterator() {
        return new FibonacciIterator(this);
    }

    public BigInteger getPrevious(){
        return this.previous;
    }

    public BigInteger getCurrent(){
        return this.current;
    }

    public BigInteger getNext(){
        return this.next;
    }

    public void setPrevious(BigInteger previous){
        this.previous = previous;
    }

    public void setCurrent(BigInteger current){
        this.current = current;
    }

    public void setNext(BigInteger next){
        this.next = next;
    }
}
