import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static final int ELEMENTSQUEUE = 10;
    private static final int POOLSIZE = 2;
    private static final ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(POOLSIZE);

    public static void main(String[] args) {

        Thread caller = new Caller();
        caller.start();
        for (int i = 0; i < POOLSIZE; i++) {
            EXECUTOR_SERVICE.execute(new Operator(Caller.CALL, ELEMENTSQUEUE));
        }
    }
}
