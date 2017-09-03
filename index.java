package guviplayer;
import java.util.*;

/**
 *
 * @author vidya
 */
public class arrayandindexmatch {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
       for(i=0;i<n;i++)
       {
         a[i]=sc.nextInt();
       }
       for(i=0;i<n;i++)
       {
           if(a[i]==i)
           {
               System.out.print(i+ " ");
           }
       }
       
    }   
}

