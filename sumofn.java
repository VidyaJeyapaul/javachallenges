package guvi;
import java.util.*;
/**
 *
 * @author vidya
 */
public class sumofn {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,sum=0;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.print(sum);
    }
        
}
