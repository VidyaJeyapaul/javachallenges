package guvi;
import java.util.*;
import java.lang.*;
/**
 *
 * @author vidya
 */
public class alphabetornot {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        char st=Character.toLowerCase(s);
        if((st>='a')&&(st<='z'))
        {
        System.out.print("Alphabet");
     
        }
        else
        {
            System.out.print("Not an Alphabet");
     
        }
    }
}