import java.io.*;
import java.util.*;
public class Pattern3
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the positive integer");
  int n=s.nextInt(),k=1;
  for(int i=1;i<=n;i++)
  {
	  for(int j=1;j<=i;j++)
	  {
	 System.out.printf("%d ",k++);
	 
	  }
	  System.out.printf(" \n");
	 
  }
}
}