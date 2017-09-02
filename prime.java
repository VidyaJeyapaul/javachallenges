package guvi2;
import java.util.*;
/**
 *
 * @author vidya
 */
public class prime {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
               System.out.print("Not Prime");
               break;
            }
        }
        if(i==n)
        {
            System.out.print("Prime");
        }
    }
}
