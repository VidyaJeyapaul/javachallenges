package guvi;
import java.util.*;
import java.lang.*; 

/**
 *
 * @author vidya
 */
public class vowelconsonant {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
        char st=Character.toLowerCase(s);
        int i;
        for(i=48;i<=90;i++)
        {
            if((st=='a')||(st=='e')||(st=='i')||(st=='o')||(st=='u'))
            {
                System.out.print("Vowel");
                break;
            }
            else
            {
                System.out.print("Consonant");
                break;
            }
        }
    }
}