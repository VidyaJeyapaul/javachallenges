package guvi3;
import java.util.*;

/**
 *
 * @author vidya
 */
public class fibonacci {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,a=0,b=1;
        System.out.print(a+ " ");
        System.out.print(b+ " ");
        int i;
        for(i=2;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+ " ");
        }
        
            
    }
}
