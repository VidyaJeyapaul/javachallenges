package guvi;
import java.util.*;

/**
 *
 * @author vidya
 */
public class largest {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=c>(a>b?a:b)?c:((a>b)?a:b);
        System.out.print(d);
    }
}

