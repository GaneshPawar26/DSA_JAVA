// package M2;

public class DiagonalSum {
    
    public static int calculate(int a[][])
    {
        int n=a.length;

        int leftsum=0;
        int rightsum=0;
        if(n%2==0)
        {
            for(int i=0;i<n;i++)
            {
                leftsum+=a[i][i];
            }
            for(int j=n-1;j>=0;j--)
            {
                rightsum+=a[j][j];
            }
            return leftsum+rightsum;
        }
        else
        {
            int mid=(n/2);
            for(int i=0;i<n;i++)
            {
                leftsum+=a[i][i];
            }
            for(int j=n-1;j>=0;j--)
            {
                rightsum+=a[j][j];
            }
            return (leftsum+rightsum)-(a[mid][mid]);

        }
    
    }

    public static void main(String args[])
    {
       int a[][]=
       {{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}
       };

       int b[][]=
       {
        {0,1,2},
        {3,4,5},
        {6,7,8}
       };
       
       System.out.println(calculate(a));
       System.out.println(calculate(b));


       
    }
}
