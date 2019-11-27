import java.util.*;
public class DoctorDilemma
{
    int check(int arr[], int s)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==s)
                return 1;
        }
        return -1;
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
                if(sum%k!=0)
                {
                    if(ob.check(sol,arr[i])!=-1 && ob.check(sol,arr[j])==-1)
                        sol[count++]=arr[j];
                    else if(ob.check(sol,arr[i])==-1 && ob.check(sol,arr[j])!=-1)
                        sol[count++]=arr[j];
                    else if(ob.check(sol,arr[i])==-1 && ob.check(sol,arr[j])==-1)
                    {
                        sol[count++]=arr[i];
                        sol[count++]=arr[j];
                    }
                }
            }
        }
        System.out.println(count);
    }
}