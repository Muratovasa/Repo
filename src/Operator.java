public class Operator extends Thread {
    @Override
    public void run() {
        int countThread = 61;
        int sleepWork = 3000;
        for (int i = 1; i < countThread; i++) {
            try {
                System.out.println("Взяли " + Main.NAMES.take());
                Thread.sleep(sleepWork);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
