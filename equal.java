import java.io.*;
import java.util.Arrays;
public class equal{
public static void main(String[] args){
int a[]={2,22,56,78,14};
for(int i : a){
System.out.println(i);
}
System.out.println("After Clearing Array:");
Arrays.fill(a,0);
for (int i : a){
System.out.println(i);
}
}
}