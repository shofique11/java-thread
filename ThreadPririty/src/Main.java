//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ThreadDemo1 t1 = new ThreadDemo1();
        ThreadDemo2 t2 = new ThreadDemo2();
        System.out.println("T1 thread priority : "+ t1.getPriority());
        System.out.println("T2 thread priority : "+ t2.getPriority());
        t1.setPriority(Thread.MIN_PRIORITY + 2);
        t2.setPriority(Thread.MAX_PRIORITY - 3);
        System.out.println("T1 thread priority : "+ t1.getPriority());
        System.out.println("T2 thread priority : "+ t2.getPriority());
        System.out.println("Currently Executing Thread : "+ Thread.currentThread().getName());
        Thread.currentThread().setPriority(10);
        System.out.println("Main Thread priority : "+ Thread.currentThread().getPriority());
    }
}