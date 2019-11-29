package Multithreading;

public class RunnableDemo 
{
    public static void main(String[] args) throws Exception
    {
        Runnable obj=new NormalClass();     //this will work on main thread
        
        /*
            We can also use the concept of anonymous class here
            Runnable obj=new NormalClass()
                    {
                        @Override
                        public void run()
                        {
                            System.out.println("OH YEAH!");
                            try{Thread.sleep(500);}catch(InterruptedException e){}
                        }
                    };
        */
        /*
            We can also use Lambda expression as the Runnable iterface is an Functional interface
            Runnable lambdaobj=() ->
                        {
                            System.out.println("OH YEAH!");
                            try{Thread.sleep(500);}catch(InterruptedException e){}
                        };
        */
     
        Hi obj1=new Hi();
        Hello obj2=new Hello();
        
        Thread t=new Thread(obj,"Runnable Thread");       //this is the way to use the methods of the Thread Class on the objects of the runnable interface
        //Thread lambdathread=new Thread(lambdaobj);
        //lambdathread.start();
        //lambdaobj.run();
        obj1.setName("Hi Thread");
        obj2.setName("Hello Thread");
        
        System.out.println("1st Thread Name: "+t.getName());
        System.out.println("2nd Thread Name: "+obj1.getName());
        System.out.println("3rd Thread Name: "+obj2.getName());
        
        System.out.println("1st Thread Status: "+t.getState());
        System.out.println("2nd Thread Status: "+obj1.getState());
        System.out.println("3rd Thread Status: "+obj2.getState());
        
        obj.run();      //calling the method of Runnable interface
        try{Thread.sleep(10);}catch(InterruptedException e){}
        t.start();      //calling the method of Thread class on a Runnable interface
        try{Thread.sleep(10);}catch(InterruptedException e){}
        obj1.start();
        try{Thread.sleep(10);}catch(InterruptedException e){}
        obj2.start();
        
        t.join();
        obj1.join();
        obj2.join();
        
        System.out.println(t.getState());
        System.out.println(obj1.getState());
        System.out.println(obj2.getState());
    }
}

class NormalClass implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("OH YEAH! "+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority()+" "+Thread.currentThread().getState()); //currentThread() is used to select current Thread which is running
        try{Thread.sleep(500);}catch(InterruptedException e){}
    }
}
