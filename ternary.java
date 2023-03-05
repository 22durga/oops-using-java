import java.io.*;
import java.util.*;
public class ternary{
public static void main (String[] args){
System.out.println("Enter your age");
Scanner s=new Scanner(System.in);
int ans,age;
 age=s.nextInt(); 
ans= age < 18 ? "you are not eligible for voting" : " you can vote ";
System.out.println(ans);
}}