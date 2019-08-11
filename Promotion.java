import java.util.*;
public class Promotion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,s=0;
        int n=sc.nextInt();
        int a[ ]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
	    //if(a[i]<a[j])
                    	s+=a[i]&a[j];
            }
        }
        System.out.println(s%101);
    }
}

            