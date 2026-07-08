///very good program it is


import java.util.Scanner;


class B
{
    public int[] sol(int a)
    {
        int arr[]=new int[a];

        for(int i=0;i<a;i++)
        {
            arr[i]=i+1;
        }

        return arr;
    }
}

class A
{
    public static void main(String []args)
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int n=sc.nextInt();

            B b1=new B();

            int result[]=b1.sol(n);

            for(int m : result)
                System.out.print(m+" ");


    }
}