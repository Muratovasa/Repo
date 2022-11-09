import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static final int ELEMENTSQUEUE=10;
    public static final BlockingQueue<String> NAMES = new ArrayBlockingQueue<>(ELEMENTSQUEUE);
    public static CopyOnWriteArrayList<String> ATCWORK=new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        Thread caller = new Caller();
        caller.start();
        Thread operator = new Operator();
        operator.start();
        Thread atc=new ATC();
        atc.start();
    }
}
