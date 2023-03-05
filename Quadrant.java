import java.io.*;
public class Quadrant {
public static void main (String args[]){
int x=-3, y=33;
if((x>0)&&(y>0)){
System.out.println("quadrant I");
}
else if((x<0)&&(y>0)){
System.out.println("quadrant II");
}
else if((x<0)&&(y<0)) {
System.out.println("quadrant III");
}
else if((x>0)&&(y<0)){
System.out.println("quadrant IV");
}
else if((y==0)&&(x!=0)){
System.out.println("x-axis");
}
else if((x==0)&&(y!=0)){
System.out.println("y-axis");
}
}
}