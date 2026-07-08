package M4;

import java.util.ArrayList;

//swap two no from arraylist =index are given

import java.util.Scanner;

public class Two {

    static ArrayList<Integer> swap(ArrayList<Integer> a,int n1,int n2)
    {
        int temp=a.get(n1);
        a.set(n1,a.get(n2));
        a.set(n2,temp);


        return a;

    }
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter two index where you want to swap no from the array");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();

        ArrayList<Integer> a1=new ArrayList<>();

        for(int i=1;i<=5;i++)
        {
            a1.add(i);
        }

        System.out.println("original was :"+a1);
        ArrayList<Integer> ans=swap(a1,a,b);

        System.out.println("After swaping array is :"+ans);

        String name="Ganesh";
        StringBuffer sb=new StringBuffer(name);
        System.out.println(sb);

        sc.close();

    }
}
