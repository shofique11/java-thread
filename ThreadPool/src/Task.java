public class Task implements Runnable{
    private String name;
    public Task(String name)
    {
        this.name = name;
    }
    public void run()
    {
        System.out.println("Executing: "+ name +" by " +Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " completed.");
    }
}
