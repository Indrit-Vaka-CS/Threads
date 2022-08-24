public class MyThread {
    private Object key1 = new Object();
    private Object key2 = new Object();
    public void a(){
        synchronized (key1){
            System.out.println("Im method a, calling method b. From thread: " + Thread.currentThread().getName());
            b();
        }
    }
    public void b(){
        synchronized (key2){
            System.out.println("Im method b, calling method c From thread: " + Thread.currentThread().getName());
            c();
        }
    }
    public void c(){
        synchronized (key1){
            System.out.println("Im method c From thread: " + Thread.currentThread().getName());
        }
    }
}
