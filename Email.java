import java.util.*;
public class Email
{
    public static void main(String args[])
    {
        int i,h,j,k; char c;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s0,s1,s2;
        String s[]=new String[n];
        String unique[]=new String[n]; 
        for(i=0;i<n;i++)
            s[i]=sc.next();
        for(i=0;i<n;i++)
        {
               s0=s[i].substring(0,s[i].indexOf('@'));
               s1=s[i].substring(s[i].indexOf('@'),s[i].length());
               s0=s0.replace(".","");
               for(h=0;h<s0.length();h++)
               {
                   if(s0.charAt(h)=='+')
                   {
                       s0=s0.replace(s0.substring(s0.indexOf('+'),s0.length()),"");
                   }         
               }
               s[i]=s0+s1;
        }
        for(i=0,k=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(s[i].equalsIgnoreCase(s[j]) && s[i]!=""&& s[j]!="")
                {
                    s[j]="";
                }
            }
        }
        System.out.println("Unique Email Addresses");
        for(i=0;i<n;i++)
        {
            if(s[i]!="")
                System.out.println(s[i]);
    }
}
}

                    
                    