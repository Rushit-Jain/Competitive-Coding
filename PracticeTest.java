import java.util.*;
public class Number
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,s=0;
int n=sc.nextInt();
for(i=1;i<=n;i++)
{
s+=i;
}
System.out.println(s);
}
}