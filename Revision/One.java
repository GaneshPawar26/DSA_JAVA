
import java.util.Scanner;


class One
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int marks[]=new int[4];

        marks[2]=sc.nextInt();

        System.out.println(marks[2]);

        sc.close();
    }
}