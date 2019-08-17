import  java.util.*;
public class Wire
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        long n,x,y,z;
        n=sc.nextLong();
        x=sc.nextLong();
        y=sc.nextLong();
        z=sc.nextLong();
        long x1=n/x;
        long x2=n%x;
        long y1=n/y;
        long y2=n%y;
        long z1=n/z;
        long z2=n%z;
        if(x2==0 || y2==0 || z2==0)
        {
            if(x2==0 && y2!=0 && z2!=0)
                System.out.println(x1);
            else if(x2!=0 && y2==0 && z2!=0)
                System.out.println(y1);
            else if(x2!=0 && y2!=0 && z2==0)
                System.out.println(z1);
            else if(x2==0 && y2==0 && z2!=0)
                System.out.println(Math.max(x1,y1));
            else if(x2!=0 && y2==0 && z2==0)
                System.out.println(Math.max(y1,z1));
            else if(x2==0 && y2!=0 && z2==0)
                System.out.println(Math.max(x1,z1));
        }
        else 
            System.out.println("-1");
    }
}
        