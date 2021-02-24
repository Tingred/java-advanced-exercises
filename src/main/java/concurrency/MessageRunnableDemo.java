package concurrency;

public class MessageRunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MessageRunnable());
        Thread thread1 = new Thread(new MessageRunnable(100));
        thread.start(); // wywołanie asynchroniczne
        while (!thread.isAlive()){
        }
        thread1.start(); // wywołanie asynchroniczne
        Thread.sleep(5000); // wywołanie synchroniczne
        thread.interrupt();
        thread1.interrupt();

    }
}
