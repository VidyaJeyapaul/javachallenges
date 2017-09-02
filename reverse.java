package guvi3;
import java.util.*;

/**
 *
 * @author vidya
 */
public class reverse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] ch=s.toCharArray();
        int i;
        for(i=ch.length-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }
    }
     
}
