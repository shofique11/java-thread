//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        X objX = new X();
        Y objY = new Y();
        Thread t1 = new Thread(objX);
        Thread t2 = new Thread(objY);
        t1.start();
        t2.start();
        System.out.println("Exit from Main");
    }
}