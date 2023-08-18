import java.util.*;
public class selectionsort
{
    public static void selection(int n[])
    {
        for(int i=0;i<=n.length-2;i++)
        {
            int min=i;
            for(int j=i+1;j<=n.length-1;j++)
            {
                if(n[min]>n[j])
                {
                    min=j;
                }
            }
            int temp=n[i];
            n[i]=n[min];
            n[min]=temp;
        }
        // printing increasing order array
        for(int i=0;i<=n.length-1;i++)
        {
            System.out.print(n[i] + " ");
        }
    }
    public static void main(String args[])
    {
        int n[]={5,4,1,3,2};
        selection(n);
    }
}