class Transpose
{
    public static void main(String []args)
    {
        int a[][]={{1,5,4},{2,7,1}};

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
                System.out.print(a[i][j]+" ");

            System.out.println("");
        }

        int arr[][]=new int[a[0].length][a.length];

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
                {
                    arr[i][j]=a[j][i];
                    System.out.print(arr[i][j]+" ");

                }

            System.out.println(" ");
        }

    }
}