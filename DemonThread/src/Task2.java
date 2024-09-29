public class Task2 implements Runnable{
    public void  run()
    {
        for (int i = 1; i<=100; i++)
        {
            System.out.println(Thread.currentThread().getName()+" Shofique "+ i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + " completed.");
    }
}
