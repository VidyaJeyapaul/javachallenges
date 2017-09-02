package guvi;
import java.util.*;
/**
 *
 * @author vidya
 */
public class sumofnaturalnumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,sum=0;
        for(i=1;i<=n;i++)
        {
        sum+=i;
        }
        System.out.print(sum);
    }
}