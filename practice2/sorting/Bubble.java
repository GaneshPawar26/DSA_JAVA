class Bubble
{
    public static void main(String []args)
    {
        int a[]={8,4,2,6,1,9};
        int temp;
        int k=a.length-1;
        for(int i=0;i<=k+1;i++)
        {
            for(int j=1;j<=k-1;j++)
            {
                if(a[j]<a[j-1])
                {
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
            k--;
        }

        for(int i=0; i<a.length;i++)
            System.out.println(a[i]);
    }
}