//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main implements Runnable {
    public void run(){
        System.out.println("Thread is created and running successfully....");
    }
    public static void main(String[] args) {
        Runnable r1 = new Main();
        Thread t1 = new Thread(r1, "Java Programming");
        t1.start();
        String s1 = t1.getName();
        System.out.println(s1);
    }
}