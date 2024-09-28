//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            A thread1= new A();
            B thread2 = new B();
            C thread3 = new C();
            thread1.start();
            thread2.start();
            thread3.start();
    }
}