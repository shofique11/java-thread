public class Table {
    synchronized void printTable(int n)
    {
        for(int i = 1; i<=10; i++)
        {
            System.out.println(n+"x"+i+"="+n*i);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
