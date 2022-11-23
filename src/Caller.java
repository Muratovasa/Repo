public class Caller extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < Main.ELEMENTSQUEUE; i++) {
            try {
                ATC.CALL.put("Звонок " + i);
                System.out.println("Поступил звонок " + i);
                Thread.sleep(ATC.sleepWork);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
