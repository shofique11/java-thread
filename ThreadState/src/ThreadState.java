public class ThreadState implements Runnable{
    public void run()
    {
        GFG g1 = new GFG();
        Thread t2 = new Thread(g1);
        // Thread is created and its in new state.
        t2.start();
        System.out.println("Hello Java programming"+" "+t2.getState());
    }
}
