import java.util.Scanner;



class A
{
    public void array_elements(int a[])
    {
        for(int m:a)
        {
            System.out.println(m);
        }
    }
}

class B extends A
{
    public int array_sum(int a[])
    {
        int sum=0;
        int k=a.length;
        System.out.println(k);

        return 0;

    }
}



class Second
{
    public static void main(String []args)
    {
            System.out.println("hii Ganesh");

            int marks[]={10,90,12,45};

            B b1=new B();

            b1.array_elements(marks);
            b1.array_sum(marks);
    }
}