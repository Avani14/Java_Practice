class foreach{
public static void main(String args[]){
int array[]= {1,2,3,4,5};
int sum = 0;
for(int num:array){
 sum+=num;
 System.out.println("VAlue is"+num);
}
System.out.println("Summation is:"+sum);
}
}