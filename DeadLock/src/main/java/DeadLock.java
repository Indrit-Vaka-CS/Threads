public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread::a);
        Thread thread1 = new Thread(myThread::b);

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();
    }
}
