import java.util.*;
public class Hannah
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,sum=0;
        int arr[]=new int[10];
        String s=sc.next();
        for(i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
                arr[Integer.parseInt(s.substring(i,i+1))]++;
        }
        for(i=0;i<arr.length;i++)
            sum+=arr[i];
        for(i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("="+sum);
        if(sum==13)
            System.out.println("Hannah Survived");
        else
            System.out.println("Hannah Did Not Survive");
        }
    }
    
