import java.util.concurrent.BlockingQueue;

public class Operator extends Thread {
    private final int COUNTHREAD;
    public static final int SLEEPWORK = 3000;
    private final BlockingQueue<String> CALLS;

    public Operator(BlockingQueue<String> calls, int countThread) {
        this.CALLS = calls;
        this.COUNTHREAD = countThread;
    }

    @Override
    public void run() {
        for (int i = 1; i < COUNTHREAD; i++) {
            try {
                Thread.sleep(SLEEPWORK);
                System.out.println(Thread.currentThread().getName() + " Взяли звонок " + CALLS.take() + "\n");
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
