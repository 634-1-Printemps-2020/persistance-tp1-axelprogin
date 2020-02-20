package ch.hesge.cours634.counter;

import ch.hesge.cours634.counter.Counter;
import ch.hesge.cours634.counter.CounterException;
import ch.hesge.cours634.counter.UpperLimitedPositiveCounter;

public class Main {

    public static void main(String[] args) throws CounterException {
        Counter counter = new Counter(0);
        counter.add(20);
        counter.add(-10);
        System.out.println(counter.getValue());

        UpperLimitedPositiveCounter upperLimitedPositiveCounter = new UpperLimitedPositiveCounter(0,100);
        upperLimitedPositiveCounter.add(99);
        upperLimitedPositiveCounter.inc();
        System.out.println(upperLimitedPositiveCounter.getValue());


    }
}
