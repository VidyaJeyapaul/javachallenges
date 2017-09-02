package guvi3;
import java.util.*;

/**
 *
 * @author vidya
 */
public class reverseint {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,a=0,x=0;
        while(n>0)
        {
            x=n%10;
            a=(a*10)+x;
            n=n/10;
        }
        System.out.print(a);
    }
}

