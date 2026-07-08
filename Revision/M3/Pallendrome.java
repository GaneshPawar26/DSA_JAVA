// package M3;

import java.util.Scanner;

public class Pallendrome
 {
    public static boolean checkPallendrome(String name)
    {
        
        for(int i=0,j=name.length()-1;i<=j;i++,j--)
        {
            if(name.charAt(i)==name.charAt(j))
            {

            }
            else return false;
        }

        return true;
    }

    public static void main(String args[])
    {
        System.out.println("Enter a string want to check for pallendrome");

        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        boolean ans=checkPallendrome(name);

        if(ans)
        {
            System.out.println("Given string is pallendrome");
        }
        else System.out.print("Given string is not pallendrome");

        sc.close();
    }
}
