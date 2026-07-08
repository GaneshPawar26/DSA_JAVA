// package Methods;
import java.util.Scanner;


public class First 
{
    public static void main(String args[])
    {
            Scanner sc=new Scanner(System.in);

            int binary=sc.nextInt();

            System.out.println(binary);
            int num=0;
            int count=0;
           while(binary>0)
            {
                int k=binary%10;
                binary=binary/10;

                if(k==0)
                {
                    if(num==0)
                    {
                        count++;
                    }
                    else
                    {
                        num = num*2;
                    }
                }
                else
                {
                    if(num==0)
                    {
                        num=1;
                        for(int j=1;j<=count;j++)
                        {
                            num = num*2;
                        }
                    }
                    else
                    {
                        num =(num*2) + 1;
 
                    }
                }

            }

            System.out.println(num);
    }
}
