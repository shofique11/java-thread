public class C extends Thread{
    public void run()
    {
        for (int k=1; k<=1000; k++)
        {
//            if(k == 10){
//                try {
//                    sleep(5000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
            System.out.println("Hello from C: "+ k);
        }
        System.out.println("Exit From C");
    }
}
