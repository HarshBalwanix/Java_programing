// program for prime number
class Prime
	{
		public static void main(String[] args)
		{
		  java.util.Scanner kb=new java.util.Scanner(System.in);
		  int n;
		  int sum=0; 
		  System.out.println("Enter any number");
		  n=kb.nextInt();
		  int temp=n; 
			while(n>0)
			{int result=1;
			 int rem=n%10; 
				while(rem>0)
				{ result=result*rem;		
					rem--;
				}
			 sum=sum+result;
			  n=n/10;
			}
		if(sum==temp)
			{
			System.out.println("Number is strong");	
			}
		else
			{
	System.out.println("Number is not strong");
				}
	}
}