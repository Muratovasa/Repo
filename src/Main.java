public class Main {
    public static final int ELEMENTSQUEUE = 10;

    public static void main(String[] args) {
        Thread caller = new Caller();
        caller.start();
        Thread atc = new ATC();
        atc.start();
        Thread operator = new Operator();
        operator.start();
    }
}
