class B
{
    public static void main(String []args)
    {
        int a[][]={{1,4,9},{11,4,3},{2,2,3} };

        int i=1;
        int sum=0;

        for(int j=0;j<a[0].length;j++)
        {
            sum+=a[i][j];
        }

        System.out.println(sum);
    }
}