// Activity selection


class A
{
    public static void main(String args[])
    {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};


        System.out.print("0 ");

        int endtime=end[0];
        for(int i=1;i<start.length;i++)
        {
            if(start[i]>=endtime)
            {
                System.out.print(i+" ");
                endtime=end[i];
            }
        }
    }
}