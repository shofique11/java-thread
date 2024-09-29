
public class Main {
    public static Thread t1;
    public static ThreadState o1;
    public static void main(String[] args) {
            o1 = new ThreadState();
            t1 = new Thread(o1);
            t1.start();
        System.out.println("post-spanning, state of t1 is"
                + " " + t1.getState());
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException i2) {
            i2.printStackTrace();
        }
        System.out.println(
                "State of Thread t2 after invoking to method sleep() is"
                        + " " + t1.getState());
        try {
            t1.join();
            System.out.println(
                    "State of Thread t2 after join() is"
                            + " " + t1.getState());
        }
        catch (InterruptedException i3) {
            i3.printStackTrace();
        }
        System.out.println(
                "state of Thread t1 after completing the execution is"
                        + " " + t1.getState());
    }

}