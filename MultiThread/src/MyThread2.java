public class MyThread2 extends Thread{
    Table t;
    MyThread2(Table y)
    {
        t=y;
    }
    public void  run()
    {
        t.printTable(8);
    }
}
