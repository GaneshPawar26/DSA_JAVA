import java.util.Scanner;


class TCS_Test
{
    public static void main(String []args)
    {
        System.out.println("Plz Enter a line");

        Scanner sc=new Scanner(System.in);

        String name= sc.nextLine();

        int k= name.length();

        // System.out.println(k);

        for(int i=0;i<k;i++)
        {
            char ch=name.charAt(i);

            if(ch==('a')||ch==('e')||ch==('i')||ch==('o')||ch==('u'))
            {
                System.out.println(ch);
            }
        }

        sc.close();
    }
}