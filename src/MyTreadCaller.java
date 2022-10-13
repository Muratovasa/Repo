public class MyTreadCaller extends Thread {

    @Override
    public void run(){
        for (int i=1; i<Elements.elementsQueue;i++){
            try {
                Main.names.put("Звонок "+i);
                System.out.println("Поступил звонок "+i);
                Thread.sleep(Elements.sleepTime);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
