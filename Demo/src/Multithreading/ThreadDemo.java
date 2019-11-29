package Multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadDemo 
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("Welcome to Multi-Threading!");
        
        Hi obj1=new Hi();
        Hello obj2=new Hello();
        Thread t= new Thread(()->
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("Anonymous");
                try{Thread.sleep(500);}catch(InterruptedException ex){}
            }   
        },"Anonymous Thread");                  //passing the Thread name as a parameter to set the name to the Thread
        
        //t.setName("Anonymous Thread");          //for setting a name to the Thread, we can also do in this way
        obj1.setName("Hi Thread");
        obj2.setName("Hello Thread");
        
        System.out.println("");
        System.out.println("Thread 1 Name: "+t.getName());        //for displaying the name of the Thread
        System.out.println("Thread 2 Name: "+obj1.getName());
        System.out.println("Thread 3 Name: "+obj2.getName()+"\n");
        
        t.setPriority(Thread.MIN_PRIORITY);             //to set Priority
        obj1.setPriority(Thread.MAX_PRIORITY);
        obj2.setPriority(5);
        
        System.out.println("1st Thread Priority: "+t.getPriority());        //to display thread priority, by default it is 5 or NORM_PRIORITY
        System.out.println("2nd Thread Priority: "+obj1.getPriority());     //priority range is [1,10], 1 least & 10 highest
        System.out.println("3rd Thread Priority: "+obj2.getPriority()+"\n");    //1 is MIN_PRIORITY & 10 is MAX_PRIORITY
        
        t.start();
        try{Thread.sleep(10);}catch(InterruptedException e){}
        obj1.start();
        try{Thread.sleep(10);}catch(InterruptedException e){}
        obj2.start();
        
        System.out.println("\nThread Anonymous is active: "+t.isAlive());       //isAlive() method is used to know the status of the Thread
        System.out.println("Thread Hi is active: "+obj1.isAlive());
        System.out.println("Thread Hello is active: "+obj2.isAlive()+"\n");
        
        t.join();
        obj1.join();        //it will wait for the thread to end and then combine it with main thread
        obj2.join();        //it will wait for the thread to end and then combine it with main thread
        
        System.out.println("Bye-Bye");    
        System.out.println("\nThread Anonymous is active: "+t.isAlive());
        System.out.println("Thread Hi is active: "+obj1.isAlive());
        System.out.println("Thread Hello is active: "+obj2.isAlive());
        System.out.println("");
    }
    
}

class Hi extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hi "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(Hi.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }
}

class Hello extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+"\n");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) 
            {
                Logger.getLogger(Hi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
