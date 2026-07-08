//use auxilary 2 arrays


class TrapWater
{

    public static void abc(int a[])
    {
    
        for(int i=0;i<a.length;i++)
        {
            int l=a[i];
            int r=0;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[i])
                {

                }
                else{

                    if(a[j]<la[j+1])
                    {
                        
                    }
                    else{

                         r=a[j];
                         break;
                    }
                }
            }

            int total=(l>r)?r:l;
            for(int k=
        }
    }


    public static void main(String []args)
    {
        int a[]={4,2,7,6,4,1,5};
        abc(a);

    }
}