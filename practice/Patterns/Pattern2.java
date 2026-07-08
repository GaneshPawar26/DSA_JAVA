package Patterns;

//Z pattern;

public class Pattern2 
{
    public static void main(String []args)
    {
        for(int i=0;i<5;i++)
        {
            if(i==0||i==4)
            {
                System.out.println("* * * * *");
            }
            else
            {
                for(int j=0;j<4-i;j++)
                {
                    System.out.print("  ");
                }
                System.out.println("*");
            }
            
        }
        
    }
}
