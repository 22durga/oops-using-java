import java.io.*;
import java.util.*;
public class Pattern4
{
public static void main(String...args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt(),k=65;
for(int i=1;i<=n;i++)
{
	for(int j=1;j<=i;j++)
	{
System.out.printf("%c ",(char) k);
}
k++;
System.out.printf("\n");
}
}
}