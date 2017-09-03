package guviplayer;
import java.util.*;

/**
 *
 * @author vidya
 */
public class repeatednumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j;
        i=0;
        while(i<n)
        {
            a[i]=sc.nextInt();
            i++;
        }
        i=0;
        while(i<n)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==0)
                {
                    i++;
                    break;
                }
                if(a[i]==a[j])
                {
                    a[j]=0;
                    System.out.print(a[i]);
                    a[i]=0;
                    i++;
                }
            }
        }
}
}
