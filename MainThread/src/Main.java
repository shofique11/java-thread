//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread("Hey Shofique");
        t1.start();
        String s = t1.getName();
        System.out.println(s);
    }
}