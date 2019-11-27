import java.util.*;
public class DoctorDilemma
{
    int check(int arr[], int s)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==s)
                return -1;
        }
        return 1;
    }
    int sumcheck(int arr[], int s, int k)
    {
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]+s)%k==0 && arr[i]!=0)
                return -1;
        }
        return 1;
    }
    public static void main(String args[])
    {
        int i,j,sum,count=0;
        DoctorDilemma ob=new DoctorDilemma();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        int sol[]=new int[n];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {                
                sum=arr[i]+arr[j];
                if(sum%k==0)
                    continue;
                else
                {
                    if(ob.check(sol, arr[i])==1 && ob.sumcheck(sol, arr[i], k)==1)
                    {
                        sol[count++]=arr[i];
                    }
                    else if(ob.check(sol, arr[j])==1 && ob.sumcheck(sol, arr[j], k)==1)
                        sol[count++]=arr[j];
                }
            }
        }
        System.out.println(count);
    }
}