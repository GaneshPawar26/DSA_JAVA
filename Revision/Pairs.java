public class Pairs
{

    public static void findPair(int n[])
    {
        for(int i=0;i<n.length-1;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                System.out.println(n[i] +":"+ n[j]);
            }
        }
    }
    public static void main(String args[])
    {
        int a[]=new int[5];
        a[0]=2;
        a[1]=4;
        a[2]=6;
        a[3]=8;
        a[4]=10;

        findPair(a);
    }
}