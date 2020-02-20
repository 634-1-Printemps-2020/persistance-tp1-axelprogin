package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {

    private int valMax;

    public UpperLimitedPositiveCounter(int init, int valMax) throws CounterException {
        super(init);
        this.valMax=valMax;
        if (init<0){
            throw new CounterException("Le conteur ne peut pas être négative");
        }
    }

    public void inc() throws CounterException {
        if (super.getValue()+1>valMax){
            throw new CounterException("Valeur max atteinte");
        }
        super.inc();
    }

    public void add(int step) throws CounterException {
        if (super.getValue()+step>valMax){
            throw new CounterException("Valeur max atteinte");
        }
        if (super.getValue()+step<0){
            throw new CounterException("Le counteur ne peut pas être négatif");
        }
        super.add(step);
    }

    public int getValue() {
        return super.getValue();
    }
}
