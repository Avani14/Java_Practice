import java.util.Scanner;
class Factorial
{
	public static void main(String[] args) {
    int factorial=1;
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number to calculate Factorial");
	int fact=sc.nextInt();
	for(int i=1;i<=fact;i++)
	{
           factorial=factorial*i;

		
	}
	System.out.println("Factorial of"+fact+"is"+factorial);
	}
}