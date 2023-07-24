class Mythread extends Thread 
{
    public Mythread(String name)
    {
        super(name);
        System.out.println("Thread details:"+this);
    }
    public void run()
    {
        try 
        {
            for(int i=1;i<=10;i+=2)
            {
                System.out.println(super.getName()+":"+i);
                Thread.sleep(5000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(super.getName()+"interrupted");
        }
    }
}

public class threading {
    
}
