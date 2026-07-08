//to find array is sorted or not


import java.util.Scanner;

public class A
{
    public static boolean sort(int arr[], int startindex)
    {
        if (startindex==arr.length-1)
            return true;

       if(arr[startindex]<=arr[startindex+1])
       {    
            startindex++;
            return sort(arr,startindex);
       }
       else
       {
        return false;
       }
    }

    public static void main(String []args)
    {
        int a[]=new int[6];
        Scanner sc= new Scanner(System.in);



        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
            
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        boolean b=sort(a,0);

        System.out.println(b);
            
    }
}