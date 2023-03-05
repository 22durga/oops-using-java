import java.io.*;
import java.util.*;
public class Odd{
public static void main (String[] args){
int num;
Scanner s=new Scanner(System.in);
num=s.nextInt(); 
if(num%2==0){
System.out.println(num+"is even integers");
}
else
{
System.out.println(num+"is odd integers");
}
}}