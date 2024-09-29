public class GFG implements Runnable{
    public void run()
    {
        ThreadState obj = new ThreadState();
        Thread t3 = new Thread(obj);
        // implementing try-catch Block to set sleep state
        // for inactive thread
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException i1) {
            i1.printStackTrace();
        }
        System.out.println("Hello C Programming"+ " "+t3.getState());
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException i2) {
            i2.printStackTrace();
        }
    }
}
