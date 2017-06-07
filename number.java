import java.io.*;
import java.util.*;
public class number
{
public static void main(String args[])
{
int n;
System.out.println("enter the number");
Scanner scan=new Scanner(System.in);
 n=scan.nextInt();
if(n==0)
{
System.out.println("the number is zero");
}
else if(n>0)
{
System.out.println("the number is positive");
}
else
{
System.out.println("the number is negative");
}
}
}
