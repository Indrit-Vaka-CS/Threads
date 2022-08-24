public class MyThread {
    private long l = 0;
    public long getNumber() {
        return  l;
    }
    public void increment(){
        synchronized (this){
            ++l;
        }
    }
}
