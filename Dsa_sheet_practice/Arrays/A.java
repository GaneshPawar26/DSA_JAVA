

class Solution
{
    public boolean calculate(int a[])
    {
        boolean a1[]=new boolean[a.length];


        for(int i=0;i<a.length;i++)
        {
            if(a1[a[i]]==true)
            {
                return true;
                
            }
            else
            {
                a1[a[i]]=true;
            }
        }

        return false;

        
    }
}


class A
{
    public static void main(String []args)
    {
        int arr[]={1,2,3,0};


        Solution s1=new Solution();
        boolean ans=s1.calculate(arr);
        System.out.println(ans);
    }
}