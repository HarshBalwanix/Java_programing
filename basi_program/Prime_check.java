// program for prime number
class Prime
	{
		public static void main(String[] args)
		{
		  java.util.Scanner kb=new java.util.Scanner(System.in);
		  int n;
		  int i=2;
		  System.out.println("Enter any number");
		  n=kb.nextInt();
			while(n>i)
			{
			 if(n%i==0){
				 System.out.println("Not a prime number");
				 break;
			 }
			i++;
			}
			if(i==n){System.out.println("Prime number");}
		}
	}