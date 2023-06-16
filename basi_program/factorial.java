// program for prime number
class Prime
	{
		public static void main(String[] args)
		{
		  java.util.Scanner kb=new java.util.Scanner(System.in);
		  int n;
		  int result=1; 
		  System.out.println("Enter any number");
		  n=kb.nextInt();
			while(n>0)
			{
			 result=result*n;
			 n--;	
			}
			System.out.println("Factorial is "+result);
			}
	}