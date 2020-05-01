import java.util.Scanner;
class maxmin{
 		public static void main(String[] args) {
 			int num2,num3=0;
 			Scanner sc=new Scanner(System.in);
 			System.out.println("Enter a number to calculate maximum : ");
 			int num1=sc.nextInt();

           while(num1>0){
            	num2=num1%10;
            	
            	if(num3<num2)
            	{
            		num3=num2;
            	}
            num1=num1/10;

            	}
            	System.out.println("Largest num "+num3);
                 	
            }

 		}
	
