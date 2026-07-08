import java.util.ArrayList;
import java.util.Scanner;
//print arryalist of string in reverse order and take elemets of arraylist from user as a string


class B
{
    public static void main(String []args)
    {
        ArrayList<String> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<4;i++)
        {
            String name=sc.nextLine();
            list.add(i,name);
        }

        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.println(list.get(i));
        }
    }
}