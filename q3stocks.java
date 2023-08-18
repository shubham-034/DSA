import java.util.*;
public class q3stocks
{
    public static int maxprofit(int num [])
    {
        int maxprofit =0;
        int curprofit=0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++)
        {
            if(buy<num[i])
            {
                curprofit = num[i]-buy;
                maxprofit=Math.max(maxprofit,curprofit);
            }
            else
            {
                buy=num[i];
            }
        }
        if(maxprofit==0)
        {
            return 0;
        }
        return maxprofit;
    }
    public static void main(String args[])
    {
        int num []={7,1,5,3,6,4};
        System.out.println(maxprofit(num));
    }
}