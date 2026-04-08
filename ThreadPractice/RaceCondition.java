class Counter {
    int count = 0;

  synchronized   void increment() {
        count++; // NOT thread safe! ❌
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) c.increment();
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) c.increment();
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Count: " + c.count); // should be 2000
        // but gets random value like 1768, 1923 ❌
    }
}