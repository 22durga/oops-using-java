import java.io.*;
import java.util.*;
public class Positive{
public static void main (String[] args){
int num;
Scanner s=new Scanner(System.in);
num=s.nextInt(); 
if(num>0){
System.out.println("number is positive");
}
else if(num<1)
{
System.out.println(" number is negative");
}
else
{
System.out.println(" number is 0");
}
}}