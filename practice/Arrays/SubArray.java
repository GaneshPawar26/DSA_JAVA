


public class SubArray
{
    public static void main(String []args)
    {
        int a[]={1,6,3,9,4,7,8};

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                for(int k=i;k<=j;k++)
                    System.out.print(a[k]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}