package DSA.DP;
import java.util.*;
public class zero_oneKnapSack {
    static class pair{
        int weight;
        int value;

        pair(int weight,int value)
        {
            this.weight=weight;
            this.value=value;
        }
    }
    public static int recursion(int W,ArrayList<pair> arr,int n)
    {
        if(W==0 ||n==0)
        {
            return 0;
        }
        int val=arr.get(n-1).value;
        int wt=arr.get(n-1).weight;

        if(wt <= W)
        {
            int include=val+recursion(W-wt, arr, n-1);
            int exclude=recursion(W, arr, n-1);
            return Math.max(include, exclude);
        }
        else
        {
            return recursion(W, arr, n-1);
        }
    }
    public static int memoization(int W,ArrayList<pair> arr,int n,int dp[][])
    {
        if(W==0 || n==0)
        {
            return 0;
        }
        if(dp[n][W]!=-1)
        {
            return dp[n][W];
        }

        int val=arr.get(n-1).value;
        int wt=arr.get(n-1).weight;

        if(wt <= W)
        {
            int include=val+memoization(W-wt, arr, n-1, dp);
            int exclude=memoization(W, arr, n-1, dp);
            return dp[n][W]=Math.max(include, exclude);
        }
        else
        {
            return dp[n][W]=memoization(W, arr, n-1, dp);
        }
    }
    public static int tabulation(int W,int value[],int weight[])
    {
            int dp[][]=new int[value.length+1][W+1];
            for(int i = 0 ; i  < dp.length ;i++)
            {
                dp[i][0]=0;
            }
            for(int j = 0 ; j < dp[0].length ;j++)
            {
                dp[0][j]=0;
            }

            for(int i = 1 ; i < dp.length; i++)
            {
                for(int j = 1 ; j < dp[0].length;j++)
                {
                    int val=value[i-1];
                    int wt=weight[i-1];

                    if(wt<=j)
                    {
                        dp[i][j]=Math.max(val+dp[i-1][j-wt],dp[i-1][j]);
                    }
                    else
                    {
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }

            return dp[dp.length-1][dp[0].length-1];
    }
    public static void zero_one_knapsack(int W,int value[],int weight[])
    {
        ArrayList<pair> arr1=new ArrayList<>();
        for(int i = 0 ; i  <value.length;i++)
        {
            arr1.add(new pair(weight[i],value[i]));
        }

    }
    public static void main(String[] args) {
        
    }
}
