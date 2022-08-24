public class FirstRunnable {
    public static void main(String[] args) throws InterruptedException {
        MyThread obj = new MyThread();
        Thread thread = new Thread(()-> {
            for (int i = 0; i < 1_000_000; i++) {
                obj.increment();
            }
        });
        Thread thread2 = new Thread(()-> {
            for (int i = 0; i < 1_000_000; i++) {
                obj.increment();
            }
        });
        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println("l = " + obj.getNumber());
    }
}
