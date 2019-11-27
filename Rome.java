import java.util.*;
public class Rome
{
    String romanDateMonth(String s)
    {
        String rd=""; int i; int d=Integer.parseInt(s);
        if(d<10)
        {
            if(d<5)
            {
                for(i=1;i<=d;i++)
                    rd=rd+"I";
            }
            if(d>=5)
            {
                rd=rd+"V";
                d-=5;
                for(i=1;i<=d;i++)
                    rd=rd+"I";
            }
        }
        else
        {
            int d1=d/10;
            for(i=1;i<=d1;i++)
                rd=rd+"X";
            d1=d%10;
            rd=rd+romanDateMonth(Integer.toString(d1));
        }
        return rd;
    }
    String romanYear(String s)
    {
        String ry=""; int i; int d=Integer.parseInt(s);
        if(d<50)
            ry=ry+romanDateMonth(s);
        else if(d>=50 && d<100)
        {
            int d1=d/50;
            for(i=1;i<=d1;i++)
                ry=ry+"L";
            d1=d%50;
            ry=ry+romanYear(Integer.toString(d1));
        }
        else if(d>=100 && d<500)
        {
            int d1=d/100;
            for(i=1;i<=d1;i++)
                ry=ry+"C";
            d1=d%100;
            ry=ry+romanYear(Integer.toString(d1));
        }
        else if(d>=500 && d<1000)
        {
            int d1=d/500;
            for(i=1;i<=d1;i++)
                ry=ry+"D";
            d1=d%500;
            ry=ry+romanYear(Integer.toString(d1));
        }
        else
        {
            int d1=d/1000;
            for(i=1;i<=d1;i++)
                ry=ry+"M";
            d1=d%1000;
            ry=ry+romanYear(Integer.toString(d1));
        }
        return ry;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Rome ob=new Rome();
        String s=sc.next();
        String d=s.substring(0,s.indexOf('/'));
        String m=s.substring(s.indexOf('/')+1,s.lastIndexOf('/'));
        String y=s.substring(s.lastIndexOf('/')+1);
        String rd,rm,ry;
        rd=ob.romanDateMonth(d);
        rm=ob.romanDateMonth(m);
        ry=ob.romanYear(y);
        System.out.println(rd+"/"+rm+"/"+ry);
    }
}