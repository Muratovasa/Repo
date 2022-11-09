public class ATC extends Thread {
    @Override
    public void run() {

        int sleepWork = 3000;
        for (int i = 1; i < Main.ELEMENTSQUEUE; i++) {
            Main.ATCWORK.add("Позвонить");
            Main.ATCWORK.add("Взять звонок в работу");
            System.out.println(Main.ATCWORK.get(i));
            try {
                Thread.sleep(sleepWork);
            } catch (InterruptedException e) {
            return;
            }
        }
    }
}

