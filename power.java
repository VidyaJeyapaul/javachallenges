package guvi2;
import java.util.*;
import java.math.*;

/**
 *
 * @author vidya
 */
public class power {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        double a=sc.nextInt();
        double m=Math.pow(n, a);
        System.out.printf("%.0f",m);
    }
}