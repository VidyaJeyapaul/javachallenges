package guvi;
import java.util.*;

/**
 *
 * @author vidya
 */
public class positiveornegative {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
        {
            System.out.print("Negative");
        }
        else if(n>0)
        {
            System.out.print("Positive");
        }
        else 
        {
            System.out.print("Zero");
        }
    }
}

