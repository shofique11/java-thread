//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            try {
                Thread.sleep(5000); // Sleep for 5 seconds
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Thread has finished.");
        });
        thread.start();
        try {
            thread.join(2000);
            System.out.println("Waited for 2 seconds.");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main thread finished.");
    }
}