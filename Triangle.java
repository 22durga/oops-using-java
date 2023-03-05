import java.io.*;
import java.util.*;
public class Triangle{
public static void main (String[] args){
int angle1;
int angle2;
int angle3;
int ans;
System.out.println("Enter the angle of 1");
Scanner s=new Scanner(System.in);
angle1=s.nextInt(); 
System.out.println("Enter the angle of 2");
angle2=s.nextInt(); 
System.out.println("Enter the angle of 3");
angle3=s.nextInt();
ans=(angle1+angle2+angle3);
if((ans==180)&&(angle1>0)&&(angle2>0)&&(angle3>0)){
System.out.println("Triangle is Formed");
}
else
{
System.out.println("Triangle is not Formed");
}
}}