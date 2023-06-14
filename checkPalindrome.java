class CheckPalindrome
{
	public static void main(String[] args)
	{
		int a=100;
		int temp =a;
		int sum=0;
		if(a>0)
			{
				int rem=a%10;
				sum=rem+(sum*10);
				a=a/10;
				rem=a%10;
				sum=rem+(sum*10);
				a=a/10;
				rem=a%10;
				sum=rem+(sum*10);
				a=a/10;
			}
		
	 
		if(temp==sum)
			{ System.out.println("Palindrome");}
		else
			{
				System.out.println("Non Palindrome");
			}		
		
}

	
	
	
}