package cocubes;
import java.util.*;
import java.lang.*;
import static java.lang.Character.isDigit;

/**
 *
 * @author vidya
 */
public class Stringexpansion {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        String s=sc.next();
        char[] ch=s.toCharArray();
        int i,j;
        for(i=0;i<ch.length;i++)
        {
            if(ch[i]>=48 && ch[i]<=57)
            {
                //System.out.print(ch[i]);
                char m=ch[i];
                //System.out.print(m);
                int n=Character.getNumericValue(m);
                for(j=1;j<=n;j++)
                {
                    System.out.print(ch[i-1]);
                }
            }
        }
}
}