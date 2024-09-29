public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(Thread.currentThread().getName() + " - Iteration " + i);
            // Yielding control to other threads
            Thread.yield();
        }
    }
}
