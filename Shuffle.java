import java.util.*;
public class Shuffle
{
    void find (int arr[], int status[], int sol[], int ele, int pos)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(ele==arr[i] && status[ele-1]==0)
            {
                sol[pos]=ele;
                status[ele-1]=1;
            }
        }
    }
    public static void main(String args[])
    {
        Shuffle ob=new Shuffle();
        int i;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int sol[]=new int[n];
        int status[]=new int[n];
        int arr[]=new int[n];
        if(n%k==0 && k%2==0)
        {
            for(i=0;i<n;i++)
            {
                arr[i]=i+1;
                status[i]=0;
            }
            int count=n/k; int lv=0; int c=0; int flag=1;
            while(count!=0)
            {
                if(flag==1)
                {
                    for(lv=c;lv<c+k;lv++)
                    {
                        ob.find(arr,status,sol,arr[lv]+k,lv);
                    }
                    flag*=-1;
                }
                else if(flag==-1)
                {
                    for(lv=c;lv<c+k;lv++)
                    {
                        ob.find(arr,status,sol,arr[lv]-k,lv);
                    }
                    flag*=-1;
                }
                c+=k;
                count--;
            }
            for(i=0;i<n;i++)
                System.out.print(sol[i]+" ");
        }
        else
        {
            System.out.println("-1");
        }
    }
}

        
        
        