import java.util.*;
class InputScanner
{
	public static void main(String [] args)
	{
		Scanner kb=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two integers ");
		a=kb.nextInt(); // next Int is non static as we are calling it with object of scanner class
		b=kb.nextInt();
		System.out.println("Sum of a and b is " + (a+b));
	}	

}