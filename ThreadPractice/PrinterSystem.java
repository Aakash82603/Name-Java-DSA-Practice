package ThreadPractice;

class Printer implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Document is printing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
       }
    }
}
class Scanner implements Runnable {
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println("Document is Scanning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class PrinterSystem {
    public static void main(String[] args) {
      Thread t1 = new Thread(new Printer());
      Thread t2 = new Thread(new Scanner());
      t1.start();
      t2.start();

    }

}