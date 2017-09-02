package guvi2;
import java.util.*;

/**
 *
 * @author vidya
 */
public class evennumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i;
        for(i=n;i<=m;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+ " ");
            }
        }
    }
}
