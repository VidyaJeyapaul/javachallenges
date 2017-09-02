
package guvi;
import java.util.*;
/**
 *
 * @author vidya
 */
public class countnoofdigits {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n!=0)
        {
            n=n/10;
            //System.out.print(n);
            count++;
        }
        System.out.print(count);
    }
}
