import java.io.*;
import java.util.*;

public class Sum {
	public static void main(String[] args) 
	{
		int num;
             int i=1;
             int Sum = 0;
		Scanner s= new Scanner(System.in);
		System.out.printf(" Please Enter any Number : ");
		num = s.nextInt();	
		while(i<=num)
		{
				Sum = Sum+i;
                        i=i+2;


		}
		System.out.printf("%d",Sum);
	}
}