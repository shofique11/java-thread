//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            A threadA= new A();
            B threadB = new B();
            C threadC = new C();
            //thread value limit 1-10, 1 is minimum, 5 is normal and default, 10 is maximum
            threadA.setPriority(Thread.MAX_PRIORITY);
            threadB.setPriority(Thread.MIN_PRIORITY);
            threadC.setPriority(threadB.getPriority() + Thread.NORM_PRIORITY);
            threadA.start();
            threadB.start();
            threadC.start();
//            for (int x = 1; x<=20; x++)
//            {
//                System.out.println("Hello from main: "+ x);
//            }
          System.out.println("Exit from main thread");
    }
}