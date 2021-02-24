package concurrency;

public class MessageThread extends Thread{

    @Override
    public void run() {
        int count = 10;
        while (!this.isInterrupted() && count-- >0){
            //tutaj własny kod wykonywany w każdej pętli wątku
            System.out.println("Aktualna temperatura: " + 100);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Przerwanie wątku");
                this.interrupt();
            }

        }
        System.out.println("KONIEC WĄTKU"+this.isInterrupted());
    }
}
