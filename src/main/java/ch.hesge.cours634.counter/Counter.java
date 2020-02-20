package ch.hesge.cours634.counter;

public class Counter implements ICounter {

    private int valeur;

    public Counter(int init) {
        this.valeur = init;
    }

    public void inc() throws CounterException {
       valeur++;
    }

    public void add(int step) throws CounterException {
      valeur+=step;
    }

    public int getValue() {
        return valeur;
    }
}
