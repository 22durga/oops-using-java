
public class Prime {
	public static void main(String[] args) 
	{
		int num;
             int i=1;
             int count=0;
		Scanner s= new Scanner(System.in);
		System.out.printf(" Please Enter any Number : ");
		num = s.nextInt();
for(i=1;i<=num;i++)
{
if(num%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println( "is a prime number");
}
else
{
System.out.printf("%d is not a prime number" + num);
}
}}
	