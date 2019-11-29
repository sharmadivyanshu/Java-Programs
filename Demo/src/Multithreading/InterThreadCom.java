package Multithreading;

//Inter Thread Commmunication Demo

class Q
{
    int n;
    boolean valueSet=false;

    public synchronized void getN() 
    {
        while(!valueSet)
        {
            try{wait(); System.out.println("Consumer Status: "+Thread.currentThread().getState());}catch(Exception e){}        //wait() is a method of Object class whereas sleep() is a method of Thread class
        }
        System.out.println("Value --> "+this.n+" "+Thread.currentThread().getName()+" "+Thread.currentThread().getState());
        valueSet=false;
        notify();           //this will notify the current thread i.e. Consumer
    }

    public synchronized void setN(int n) 
    {
        while(valueSet)
        {
            try{wait();  System.out.println("Producer Status: "+Thread.currentThread().getState());}catch(Exception e){}
        }
        this.n = n;
        System.out.println("Value --> "+this.n+" "+Thread.currentThread().getName()+" "+Thread.currentThread().getState());
        valueSet=true;
        notify();           //this will notify the current thread i.e. Producer
    }
}

class Producer implements Runnable
{
    Q q;

    public Producer(Q q) 
    {
        this.q = q;
        Thread t=new Thread(this,"Producer");
        t.start();
    }
    @Override
    public void run()
    {
        int i=0;
        while(true)
        {
            q.setN(i++);
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }    
}

class Consumer implements Runnable
{
    Q q;
    
    public Consumer(Q q) 
    {
        this.q=q;
        Thread t=new Thread(this,"Consumer");
        t.start();
    }
    @Override
    public void run()
    {
        while(true)
        {
            q.getN();
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }    
}
public class InterThreadCom 
{
    public static void main(String[] args) 
    {
        Q q=new Q();
        new Producer(q);
        new Consumer(q);
    }
}
