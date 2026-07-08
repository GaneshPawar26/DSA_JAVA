
//we can solve it in a O(n) too 


class Third

{
    public static int solution(int a[])
    {
        int buy=Integer.MAX_VALUE,sell=Integer.MIN_VALUE;
        // int ans=-1;
        int difference=0;

        for(int i=0;i<a.length;i++)
        {
            buy=a[i];
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]>buy && a[j]-buy>difference)
                {
                    difference=a[j]-buy;
                    // ans=j;
                }
            }
        }

        return difference;


    }


    public static void main(String []args)
    {
        int arr[]={7,1,5,3,6,1};

        int ans=solution(arr);
        System.out.println(ans);
    }
}