import java.util.*;
public class bubblesort
{
    public static void bubbles(int n [])
    {
        for(int i=0;i<=n.length-2;i++)
        {
            int swap=0;
            for(int j=0;j<=(n.length-2)-i;j++)
            {
                if(n[j]>n[j+1])
                {
                    int temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0)
            {
                break;
            }
        }
        for(int i=0;i<=n.length-1;i++)
        {
            System.out.print(n[i] + " ");
        }
    }

    public static void main(String args[])
    {
        int n []={5,4,1,3,2};
        bubbles(n);
    }
}