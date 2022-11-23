import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ATC extends Thread {
    public static final BlockingQueue<String> CALL = new ArrayBlockingQueue<>(Main.ELEMENTSQUEUE);
    public static int sleepWork = 3000;

    @Override
    public void run() {
        for (int i = 1; i < Main.ELEMENTSQUEUE; i++) {
            try {
                CALL.put("Позвонить");
                CALL.put("Взять звонок в работу");
                System.out.println(CALL.take());
                Thread.sleep(sleepWork);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

