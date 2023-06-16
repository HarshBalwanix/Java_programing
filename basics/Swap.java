class Swap
{
	public static void main(String [] args)
	{
	 int a=Integer.parseInt(args[0]);
	 int b=Integer.parseInt(args[1]);
	System.out.println("Before swapping");
	System.out.println(a+","+b);
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("After swapping");
	System.out.println(a+","+b);
	}
}