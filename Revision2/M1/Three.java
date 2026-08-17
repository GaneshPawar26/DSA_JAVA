import java.util.Scanner;
// program to find out 3rd smallest-comdition min array size is 3

public class Three

{
    public static int getAns(int a[])
    {
        int min=a[0];
        int index=0;
        int j;
        int ans=10;
        
        for(int i=0;i<3;i++)
        {
            for(j=0;j<a.length-i;j++)
            {
                if(a[j]<min)
                {
                    min=a[j];
                    index=j;
                }
            }
            a[index]=a[j-1];
            a[j-1]=min;
            ans=min;
            min=a[0];
        }
        return ans;
    }

   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Plz enter the size of an array");
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Good now enter the elements of an array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("the array you have entered is: ");

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+": ");
        }

        int ans=getAns(arr);
        System.out.println(" ");
        System.out.println(ans);
       
    } 
}
