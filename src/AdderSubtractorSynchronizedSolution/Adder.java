package AdderSubtractorSynchronizedSolution;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    Value v;

    public Adder(Value v) {
        this.v = v;
    }

    @Override
    public Void call() {
        for (int i = 1; i <= 5000; i++) {
            v.increment();
        }
        return null;
    }
}
