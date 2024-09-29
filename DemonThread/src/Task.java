public class Task implements Runnable{
    public void  run()
    {
        for (int i = 1; i<=10; i++)
        {
            System.out.println(Thread.currentThread().getName()+" Iteration "+ i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " completed.");
    }
}
