public class Operator extends Thread {
    private static final int COUNTHREAD = 61;

    @Override
    public void run() {
        for (int i = 1; i < COUNTHREAD; i++) {
            try {
                System.out.println("Взяли звонок " +i+"\n");
                Thread.sleep(ATC.sleepWork);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
