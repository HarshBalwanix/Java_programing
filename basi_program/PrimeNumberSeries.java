// program for prime number
class PrimeNumberSeries
	{
		public static void main(String[] args)
		{
		  java.util.Scanner kb=new java.util.Scanner(System.in);
		  
		  System.out.println("Enter the range");
		  int x1=kb.nextInt();
		  int x2=kb.nextInt();
		 System.out.println("List of prime numbers is ");
			for(;x1<=x2;x1++)
			{	int i=2;
			 	for(;i<x1;i++)
				{
					if(x1%i==0){ break;}
				}
				if(i==x1)
				{System.out.println(i);}	
			}
			
	}
}