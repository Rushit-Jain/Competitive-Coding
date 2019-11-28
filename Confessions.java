import java.util.*;
public class Confessions
{
    void quickSort(int arr[], int p, int r) //Descending Sorting
    {
        int q;
        if(p<r)
        {
            q=partition(arr,p,r);
            quickSort(arr,p,q-1);
            quickSort(arr,q+1,r);
        }
    }
    int partition(int arr[], int p, int r)
    {
        int i,j,x,temp;
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
        Confessions ob=new Confessions();
        Scanner sc=new Scanner(System.in);
        int i,tc=0;
        int n=sc.nextInt();
        int k=sc.nextInt();
        int cost[]=new int[n];
        for(i=0;i<n;i++)
            cost[i]=sc.nextInt();
        if(n==k)
        {
            for(i=0;i<n;i++)
                tc+=cost[i];
        }
        else if(n>k)
        {
            ob.quickSort(cost,0,n-1);
			for(i=0;i<k;i++)
				tc+=cost[i];
			int n1=n-k;;
			int c=1;
			while(n1!=0)
			{
				for(i=c*k;i<2*c*k;i++)
				{
					if(i>=n)
					{
						n1=0;
						break;
					}
					else
					{
						tc+=(c+1)*cost[i];
						n1--;
					}
				}
				c++;
			}
        }
        System.out.println(tc);
    }
}