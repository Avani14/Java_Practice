import java.util.Scanner;
class Reverse{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		int num1 = sc.nextInt();
		int reverse =0;
		while(num1>0)
		{
			int num2 = num1 % 10;
			 reverse = reverse * 10 + num2;
			num1 /= 10 ;
		}
		System.out.println("Reverse number is : "+reverse);
	}
} 