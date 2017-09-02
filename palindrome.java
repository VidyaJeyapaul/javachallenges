package guvi2;
import java.util.*;
/**
 *
 * @author vidya
 */
public class numberpalindrome {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=0;
        int m=n;
        int a=0;
        while(n!=0)
        {
            d=n%10;
            a=(a*10)+d;
            n=n/10;
        }
        if(m==a)
        {
            System.out.print("palindrome");
        }
        else
        {
            System.out.print("Not a palindrome");
        }
    }
        
}

