import java.util.*;
public class AlienInvasion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int gs=0;
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x<y)
        {
            while(x!=1)
            {
                x--;
                y--;
                gs++;
            }
            while(x!=y)
            {
                x*=2;
                gs++;
            }
            while(x!=0 && y!=0)
            {
                x--;
                y--;
                gs++;
            }
        }
        else if(x>y)
        {
            while(y!=1)
            {
                x--;
                y--;
                gs++;
            }
            while(y!=x)
            {
                y*=2;
                gs++;
            }
            while(x!=0 && y!=0)
            {
                x--;
                y--;
                gs++;
            }
        }
        else
        {
            while(x!=0 && y!=0)
            {
                x--;
                y--;
                gs++;
            }
        }
        System.out.println(gs);
    }
}
