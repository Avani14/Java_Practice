import java.util.Scanner;
public class Sum{
	public static void main(String[] args) {
		int num,num1,temp,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to calculate sum");
		num=sc.nextInt();
		temp=num;
		while(num > 0){
			num1=num%10;
			sum=sum+num1;
			num=num/10;
		}
		System.out.println("Sum of digits of number "+temp+" is "+sum);

	}
}