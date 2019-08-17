import java.util.*;
public class Indecisive_Ryan
{
    public static void main(String args [])
    {
        Scanner sc=new Scanner(System.in);
        long m,n,p,i,k,d,diff,c=0;
        m=sc.nextLong();
        n=sc.nextLong();
        p=sc.nextLong();
        for(i=m;i<=n;i++)
        {
            d=0;
            k=i;
            while(k!=0)
            {
                d=(d*10)+(k%10);
                k=k/10;
            }
            diff=(long)Math.abs(d-i);
            if(diff%p==0)
                c++;
        }
        System.out.println(c);
    }
}
