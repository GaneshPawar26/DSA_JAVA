//removing duplicates from the string
//done without recurssion


import java.util.Scanner;


public class RemoveDuplicate
{
    public static void main(String []args)
    {
        String name;

        Scanner sc=new Scanner(System.in);

        name=sc.next();

        StringBuffer sb=new StringBuffer(name); 


        boolean arr[]=new boolean[26];

        StringBuffer sb1=new StringBuffer();

        


        for(int i=0;i<sb.length();i++)
        {
            char ch=sb.charAt(i);

            int m=ch-'a';
            if(arr[m]==false)
            {
                arr[m]=true;
                // System.out.print(ch);

                sb1.append(ch);

            }
        }

        System.out.println(sb1);
        


    }
}