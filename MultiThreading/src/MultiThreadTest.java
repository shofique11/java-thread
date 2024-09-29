public class MultiThreadTest implements Runnable{
    public void run()
    {
        try {
            System.out.println("Thread class "+ Thread.currentThread().getId()+ " is running");
        }catch (Exception e)
        {
            System.out.println("Exception is caught");
        }
    }
}
