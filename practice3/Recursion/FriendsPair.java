import java.util.Scanner;




class FriendsPair
{

    public static int pair(int n)
{
    if(n==1 || n==2)
    {
        return n;

    }



    int sum1=pair(n-1);
    int sum2=(n-1)*pair(n-2);

    return sum1+sum2;
}

    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();

        int ans=pair(n);

        System.out.println(ans);

    }
}