public class MultiThreadingDemo extends Thread{
    public void run()
    {
        try {
            System.out.println("Thread interface "+ Thread.currentThread().getId()+ " is running");
        }catch (Exception e)
        {
            System.out.println("Exception is caught");
        }
    }
}
