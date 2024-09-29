//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Thread userThread = new Thread(new Task(), "User thread");
       Thread demonThread = new Thread(new Task2(), "Demon thread");
       demonThread.setDaemon(true);
       userThread.start();
       demonThread.start();
       try {
           Thread.sleep(3000);
       }catch (InterruptedException e){
           e.printStackTrace();
       }
    }
}