import java.io.*;
import java.util.*;
public class Leap{
public static void main (String[] args){
int num;
Scanner s=new Scanner(System.in);
num=s.nextInt(); 
if(year%4==0){
System.out.println(num+" is a leap year");
}
else 
{
System.out.println(num+" is not a leap year");
}
}}