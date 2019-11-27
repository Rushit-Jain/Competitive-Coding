import java.util.*;
public class AltTab
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=0,j=0;
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        while(k>n)
            k-=n;
        int temp=arr[k-1];
        int newarr[]=new int[n];
        newarr[j++]=temp;
        for(i=0;i<k-1;i++)
            newarr[j++]=arr[i];
        for(i=k;i<n;i++)
            newarr[j++]=arr[i];
        for(i=0;i<n;i++)
            System.out.println(newarr[i]+" ");
        }
    }