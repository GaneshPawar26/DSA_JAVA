import java.util.Scanner;


class Elements
{
    Scanner sc=new Scanner(System.in);
    int a1=sc.nextInt();
    int a2=sc.nextInt();
    int a3=sc.nextInt();

    public int sum()
    {
        return a1+a2+a3;
    }

}


class Average
{
    public static void main(String []args)
    {
        System.out.println("Enter the three elements to get average");
        Elements e1=new Elements();

        int sum=e1.sum();
        sum/=3;
        int $=10;
        System.out.println(sum);

    }
}