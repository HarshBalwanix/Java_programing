 class TimeShow {
    int t1; //hours
    int t2; //mins
    void getTime(int hr,int min)
    {
        t1=hr;
        t2=min;
    }   
    void showtime()
    {
        if(t2>60)
        {
            int temp =t2/60;
            t1=t1+temp;
            t2=t2%60;
        }
        System.out.println("Time in hours is "+t1+" Time in mins "+t2);
    }
}
public class timeExample 
{
    public  static void main(String[] args)
    {
        TimeShow time1=new TimeShow();
        time1.getTime(5,76);
        time1.showtime();
    }
}
