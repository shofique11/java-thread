public class MyThread1 extends Thread{
    Table t;
    MyThread1(Table x){
        t = x;
    }
    public void run(){
        t.printTable(5);
    }
}
