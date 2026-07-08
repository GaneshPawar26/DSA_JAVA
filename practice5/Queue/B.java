//Queue implementation via array, linkedlist , stack
//arrayList
//we can do circular queue by array

import java.util.ArrayList;

class B
{

    static int rear;
    public static void enqueue(ArrayList<Integer> arr,int num)
    {
        
        arr.add(rear+1,num);

        rear++;
        return;

    }

    public static int dequeue(ArrayList<Integer> arr)
    {
        int removed=arr.remove(0);
        rear--;

        return removed;


    }

    public static int front(ArrayList<Integer> arr)
    {
        

        return arr.get(0);


    }


    public static void printqueue(ArrayList<Integer> arr)
    {
        System.out.println(arr);
    }


    public static void main(String args[])
    {
        ArrayList<Integer> arr=new ArrayList<>();
        rear=-1;

        enqueue(arr,10);
        enqueue(arr,20);
        System.out.println(front(arr));

        enqueue(arr,30);


        printqueue(arr);

        System.out.println(dequeue(arr));
        printqueue(arr);

        System.out.println(front(arr));
    }
}