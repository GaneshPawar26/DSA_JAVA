// package Revision2.M1;
import java.util.Scanner;
import java.util.ArrayList;

public class One {

    public static ArrayList<Integer> ans=new ArrayList<>();

    public  static int i=0;
    public static void sol(int a[],int key)
    {
        
        if(i>=a.length)
        {
            return;
        }
        if(a[i]==key)
        ans.add(i);

        i++;
        sol(a,key);
        
    }
    

    public static void main(String args[])
    {
        System.out.println("Hellow");

        System.out.println("Enter array of 9 elements");
        Scanner sc=new Scanner(System.in);
        int a[]=new int[9];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("Ok now add key");
        int key=sc.nextInt();

        sol(a,key);
        System.out.println(ans);
    }
}
