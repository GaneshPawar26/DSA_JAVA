import java.util.Scanner;

public class A
{

    
    public static void printIndex(int arr[],int index, int key)

    {
        if(index>=arr.length)
        {
            return;
        }

        if(arr[index]==key)
        {
            System.out.print(index+" ");
            printIndex(arr,++index,key);
            
        }
        else
            printIndex(arr,++index,key);
    }


    public static void main(String []args)
    {
        int[] arr = {3, 2, 4, 3, 6, 3, 7, 2, 2};
        int k=3;

        printIndex(arr,0,k);
    }
}