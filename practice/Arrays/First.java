import java.util.*;


class Array
{
    public static void main(String []args)
    {
            Scanner sc=new Scanner(System.in);

            String name=sc.next();
            System.out.println("Your name is " +  name);


            char ch=name.charAt(1);
            char a[]=new char[name.length()];

            for(int i=name.length()-1;i>=0;i--)
            {
                System.out.print(name.charAt(i));
                a[i]=name.charAt(i);
                System.out.print(" "+a[i]);
            }

            

    }        

}