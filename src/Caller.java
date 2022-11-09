public class Caller extends Thread {
    @Override
    public void run(){
        int sleepTime = 1000;
        for (int i = 1; i< Main.ELEMENTSQUEUE; i++){
            try {
                Main.NAMES.put("Звонок "+i);
                System.out.println("Поступил звонок "+i);
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
