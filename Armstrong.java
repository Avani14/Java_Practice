import java.util.Scanner;
class Armstrong
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,arm = 0,temp,num2;
		System.out.println("Enter a number to calculate if it is an Armstrong number");
		num1 = sc.nextInt();
		temp = num1;
		while(num1>0)
		{
			num2 = num1%10;
			num1 /= 10;
			arm = arm + (num2*num2*num2);
			if(temp==arm)
			{
				System.out.println("The number is an Armstrong number");
			}
			else
				{
				System.out.println("The number is not an Armstrong number");
			}
		}
	}
}