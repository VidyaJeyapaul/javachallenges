package guvi2;
import java.util.*;

/**
 *
 * @author vidya
 */
public class factorial {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,fact=1;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.print(fact);
    }
}
