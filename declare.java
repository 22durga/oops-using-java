import java.io.*;
import java.util.*;
class declare{
public static void main(String[] args)
{
int n;
int i;
int sum=1;
Scanner s=new Scanner (System.in);
n=s.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
sum=sum*a[i];
}

System.out.println(sum);


}}