package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {


    public UpperLimitedPositiveCounter(int init, int valMax) throws CounterException {
       super(init, valMax);
    }

    public void inc() throws CounterException {
        super.inc();
    }

    public void add(int step) throws CounterException {
        super.add(step);
    }

    public int getValue() {
        return super.getValue();
    }
}
