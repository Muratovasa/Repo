import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args){
        int elementsQueue=10;
        int sleepTime= 1000;
        int sleepTimeWork= 3000;
        int countThread=61;

        BlockingQueue<String> names= new ArrayBlockingQueue<>(elementsQueue);
        new Thread(()->{
            for (int i=1; i<countThread;i++){
                try {
                    names.put("Звонок "+i);
                    System.out.println("Поступил звонок "+i);
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                   return;
                }
            }
        }).start();

        new Thread(()->{
            for (int i=1;i<countThread;i++){
                try {
                    System.out.println("Взяли "+names.take());
                    Thread.sleep(sleepTimeWork);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }).start();
    }
}
