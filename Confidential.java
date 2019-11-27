import java.util.*;
public class Confidential
{
    public static void main(String args[])
    {
        int i; String sn1="",sn2="",s1,s2;
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s=s.toLowerCase();
        //Step-1
        for(i=0;i<s.length();i+=2)
        {
            if(i<=s.length()-2)
            {
                s1=s.substring(i,i+1);
                s2=s.substring(i+1,i+2);
                sn1=sn1+s2+s1;
            }
        }
        if(s.length() % 2!=0)
            sn1=sn1+s.substring(s.length()-1,s.length());
        //Step-2
        //Sum of ASCII Code of a and z is 219 and so is for b and y i.e. an arithmetic progression
        int ascii; char c;
        for(i=0;i<sn1.length();i++)
        {
           ascii=(int)(sn1.charAt(i));
           ascii=219-ascii;
           c=(char)ascii;
           sn2=sn2+c;
        }
        System.out.println(sn2);
    }
}