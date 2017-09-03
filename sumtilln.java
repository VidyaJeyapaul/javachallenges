package guvi3;
import java.util.*;
/**
 *
 * @author vidya
 */
public class sumtillspecified {
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
           

