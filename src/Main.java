import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static BlockingQueue<String> names = new ArrayBlockingQueue<>(Elements.elementsQueue);

    public static void main(String[] args) {
        Thread treadCaller = new MyTreadCaller();
        treadCaller.start();
        Thread treadAnswered = new MyTreadAnswered();
        treadAnswered.start();
    }
}
