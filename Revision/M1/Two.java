public class Two {
    // max subarray sum


    public static int maxSum(int a[])
    {
        int max=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                int sum =0;
                for(int k=i;k<=j;k++)
                {
                    sum+=a[k];
                }
                if(sum>max) 
                {
                    max=sum;
                }
            }
        }

        return max;
    }
    public static void main(String args[]) 
    {
        int a[] = { 1, -2, 6, -1, 3 };
        // int b[]={2,4,6,8,10};

        int ans = maxSum(a);
        System.out.println(ans);

    }

}
