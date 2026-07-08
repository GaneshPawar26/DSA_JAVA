public class MaxSumArray
{

    public static void main(String []args)
    {
        int a[]={2,-1,5,-3,7,4,1};
        for(int i=0;i<a.length;i++)
            {
                    for(int j=i+1;j<a.length;j++)
                    {
                        int sum=0;
                        for(int k=i;k<=j;k++)
                        {
                            sum=sum+a[k];
                        }
                        System.out.print(sum);
                        System.out.print(" ");
                    }
                    System.out.println("");
            }
        
    }





}