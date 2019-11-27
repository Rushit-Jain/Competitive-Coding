import java.util.*;
public class TruthLie
{
    int check (int arr[], int s, int pos)
    {
        for(int i=0;i<20;i++)
        {
            if(i!=pos && s!=0 && arr[i]>0)
            {
                arr[i]--;
                s--;
            }
        }
        if(s==0)
            return 1;
        else
            return -1;
    }
    public static void main(String args[])
    {
        TruthLie ob=new TruthLie();
        Scanner sc=new Scanner(System.in);
        int i,j;
        boolean flag=true;
        int arr[]=new int[20];
        for(i=0;i<20;i++)
            arr[i]=sc.nextInt();
        for(i=0;i<20;i++)
        {
            for(j=0;j<20;j++)
            {
                if(arr[i]!=0 && ob.check(arr, arr[i], i)==-1)
                {
                    flag=false;
                    break;
                }
            }
            if(flag==false)
                break;
        }
        if(flag==false)
            System.out.println("0");
        else
            System.out.println("1");
    }
}