import java.util.*;
public class WatchesCovers
{
    void quickSort(long arr[],int p,int r)
    {
        int q;
        if(p<r)
        {
            q=partition(arr,p,r);
            quickSort(arr,p,q-1);
            quickSort(arr,q+1,r);
        }
    }
    int partition(long arr[],int p,int r)
    {
        int i,j; long x,temp;
        x=arr[r];
        i=p-1;
        for(j=p;j<r;j++)
        {
            if(arr[j]>=x)
            {
                i++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[i+1];
        arr[i+1]=arr[r];
        arr[r]=temp;
        return (i+1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        WatchesCovers ob=new WatchesCovers();
        int i,j,k=0;long ans=-1;
        int b=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();
        long watches[]=new long[n];
        long pcovers[]=new long[m];
        long combinations[]=new long[n*m];
        for(i=0;i<n;i++)
            watches[i]=sc.nextLong();
        for(i=0;i<m;i++)
            pcovers[i]=sc.nextLong();
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
                combinations[k++]=watches[i]+pcovers[j];
        }
        ob.quickSort(combinations,0,(m*n)-1);
        for(i=0;i<m*n;i++)
        {
            if(combinations[i]<=b)
            {
                ans=combinations[i];
                break;
            }
        }
        System.out.println(ans);
    }
}