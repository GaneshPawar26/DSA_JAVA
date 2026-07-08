//finding subset of string


import java.util.Scanner;


class Subset
{

    public static StringBuffer[] sol(StringBuffer name)
    {

        
        StringBuffer arr[]=new StringBuffer[(int)Math.pow(2,name.length())];


        for(int i=0;i<arr.length;i++)
        {
            arr[i]=new StringBuffer();
            // for(int j=i;j<name.length();j++)
            // {
            //     char ch=name.charAt(j);
            //     arr[i].append(ch);
            // }


            for (int j = 0; j < name.length(); j++) 
            {
                if ((i & (1 << j)) != 0) 
                {
                    arr[i].append(name.charAt(j));
                }
            }   
        }

       
        return arr;
    }


    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a String");

        String s=sc.nextLine();

        StringBuffer sb=new StringBuffer(s);

        StringBuffer ans[]=sol(sb);

        for(StringBuffer n:ans)
        {
            System.out.println(n);
        }
        





    }
}