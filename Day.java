import java.util.*;
public class Day
{
    public static void main(String args[])
    {
	long days;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1[]=s.split("/");
        long a[]=new long[3];
        for(int i=0;i<3;i++)
            a[i]=Long.parseLong(s1[i]);
        long y=(a[2]-1)*365;
        long m=(a[1]-1)*31;
        days=y+m+a[0]-1;

        while(days>=7)
        {
            days=days-7;
        }
        System.out.println(days);
    }
}
