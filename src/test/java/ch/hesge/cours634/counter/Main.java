package ch.hesge.cours634.counter;

import ch.hesge.cours634.counter.Counter;
import ch.hesge.cours634.counter.CounterException;
import ch.hesge.cours634.counter.UpperLimitedPositiveCounter;

public class Main {

    public static void main(String[] args) throws CounterException {
        Counter c = new UpperLimitedPositiveCounter(0,100);

        c.add(50);
        c.add(51);
        System.out.println(c.getValue());
    }
}
