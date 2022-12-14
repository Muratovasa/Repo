import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Caller extends Thread {
    public static final BlockingQueue<String> CALL = new ArrayBlockingQueue<>(Main.ELEMENTSQUEUE);

    @Override
    public void run() {
        for (int i = 1; i < Main.ELEMENTSQUEUE; i++) {
            try {
                CALL.put("Звонок " + i);
                System.out.println("Поступил звонок " + i);
                Thread.sleep(Operator.SLEEPWORK);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
