package Multithreading;

class Counter
{
    int count;
    
    public synchronized void increment()            //synchronized is used for making a method used by only 1 thread at a time
    {
        count++;
    }
}
public class SyncDemo 
{
    public static void main(String[] args) throws Exception
    {
        Counter c=new Counter();
        
        Thread t1=new Thread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        for(int i=0;i<1000;i++)
                        {
                            c.increment();
                        }
                    }
                });
        Thread t2=new Thread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        for(int i=0;i<1000;i++)
                        {
                            c.increment();
                        }
                    }
                });
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        System.out.println("Count = "+c.count);
                
    }
}
