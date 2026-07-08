import java.util.Scanner;

class CheckSign
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num>0)
        {
            System.out.println("No is positive");
            return;
        }
        else
            {   if(num<0)
                {
                    System.out.println("no is -ve");
                    return;
                }
                
            }

        System.out.println("No is 0");
        return;
    }
}