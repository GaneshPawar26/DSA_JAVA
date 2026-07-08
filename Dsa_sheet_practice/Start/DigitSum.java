import java.util.Scanner;



class DigitSum
{

    public static int sum(int num)
    {

        int k;
        int ans=0;

        while(num>0)
        {
            k=num%10;
            ans+=k;
            num/=10;
        }

        return ans;
    }
    public static void main(String args[])
    {
        int num;

        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        int ans=sum(num);

        System.out.println(ans);
    }
}