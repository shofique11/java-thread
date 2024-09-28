public class A extends Thread{
    public void  run()
    {
        for(int i = 1; i<=20; i++)
        {
            if(i == 3){
                yield();
            }
            System.out.println("Hello from A: "+ i);
        }
        System.out.println("Exit from A");
    }
}
