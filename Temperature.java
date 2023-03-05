import java.io.*;
import java.util.*;
public class Temperature
{
public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the Temperature");
  int Temp=s.nextInt();
  if(Temp<0)
  {
  System.out.println("Freezing Temperature");
  }
 else if((Temp>=0)&&(Temp<=0))
 {
 System.out.println("Very cool temperature");
 }
else if((Temp>=10)&&(Temp<=20))
 {
 System.out.println("Cold whether");
 }
else if((Temp>=20)&&(Temp<=30))
 {
 System.out.println("Normal Whether");
 }
else if((Temp>=30)&&(Temp<=40))
 {
 System.out.println("Hot Temperature");
 }
 else
 {
 System.out.println("Very hot temperature");
}
}
}