public class MyTreadAnswered extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < Elements.countThread; i++) {
            try {
                System.out.println("Взяли " + Main.names.take());
                Thread.sleep(Elements.sleepTimeWork);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
