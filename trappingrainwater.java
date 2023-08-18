import java.util.*;
public class trappingrainwater
{
    public static int trw(int height[])
    {
        int n = height.length;
        int maxleft[] = new int[n];
        int maxright []= new int[n];
        int wl=0;
        int trwa=0;
        // maxleft[0]=height[0];  ------> as no bar present in left before 0 th index
        maxleft[0]=height[0];
        // maxright[n]=height[0];  ------> as no bar present in right  after n th index
        maxright[n-1]=height[n-1];

        // arary for maxleft
        for(int i=1;i<=n-1;i++)
        {
            maxleft[i]=Math.max(maxleft[i-1],height[i]);
        }
        
        
        // array for maxright
        for(int i=n-2;i>=0;i--)
        {
           maxright[i]=Math.max(maxright[i+1],height[i]);
        }
        

        // calculating traped rainwater
        for(int i=0;i<=n-1;i++)
        {
        wl= Math.min(maxleft[i],maxright[i]);
        trwa=trwa + (wl-height[i]);
        }

        return trwa;
        
    }
    public static void main(String args[])
    {
        int height[] ={4,2,0,6,3,2,5};
        System.out.println(trw(height));
    }
}