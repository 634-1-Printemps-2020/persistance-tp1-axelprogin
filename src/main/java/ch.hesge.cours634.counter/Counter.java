package ch.hesge.cours634.counter;

public class Counter implements ICounter {

    private int v;
    private int valMax;


    public Counter(int init, int valMax) throws CounterException {
        if (init < 0){
            throw new CounterException("la valeur ne peut pas être négative");
        }
        v = init;
        this.valMax = valMax;
    }

    public void inc() throws CounterException {
        if (v+1==valMax){
            throw new CounterException("Valeur max atteinte");
        }
        v+=1;
    }

    public void add(int step) throws CounterException {
        if (step < 0){
            throw new CounterException("Le step ne peut pas être plus petit que 0");
        }
        if (v+step>valMax){
            throw new CounterException("Valeur max atteinte");
        }
        v+=step;

    }

    public int getValue() {
        return v;
    }
}
