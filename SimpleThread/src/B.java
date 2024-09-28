public class B extends Thread{
    public void run()
    {
        for (int j=1; j<=1500; j++)
        {
//            if(j == 5){
//                stop();
//            }
            System.out.println("Hello from B: "+ j);
        }
        System.out.println("Exit From B");
    }
}
