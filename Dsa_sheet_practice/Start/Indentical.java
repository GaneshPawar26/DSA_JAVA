

public class Indentical 
{
    public static void main(String args[])
    {
        int a[]={2,3,3,3,2,2,6,4,4,4,4};
        int i,j;
        int count=0;
        int x;
        int flag=0;
        for(i=0;i<a.length;i++)
        {
            x=a[i];
            for(j=i;j<i+x && j<a.length;j++)
            {
                if(a[j]==x)
                {

                }
                else
                {
                    // i=j;
                    flag=1;
                    break;
                }
            }

            if(j==i+(x))
            {
                count++;
            }
            i=j-1;
            
        }

        System.out.println(count);
    }
}