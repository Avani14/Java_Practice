public class practice
{
	practice()
	{
     System.out.println("Hello");
	}
	practice(int a)
	{ 
		int b=10,c=6;
		a = b+c;
		 System.out.println("This is second constructor"+a);
	}
	practice(String b)
	{
		
		 System.out.println("Bye");
	}
	public static void main(String[] args) {
		
		practice p2 = new practice("Hey");
	}
}