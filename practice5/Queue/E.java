// interleave 2 halves of a QUEUE

//solve if queue is given as parameter

// here solved by myself maam solved by different method


import java.util.*;

class E
{


    public static int sol(int arr[])
    {
        int mid=arr.length/2;

        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2=new LinkedList<>();

        for(int i=0;i<mid;i++)
        {
            q1.add(arr[i]);
        }

        for(int j=mid;j<arr.length;j++)
        {
            q2.add(arr[j]);
        }

        Queue<Integer> qFinal=new LinkedList<>();

        qFinal.add(q1.remove());

        int n1=1;
        int n2=0;

        for(int k=1;k<arr.length;k++)
        {
            if(n2<n1)
            {
                qFinal.add(q2.remove());
                n2++;
            }
            else
            {
                qFinal.add(q1.remove());
                n1++;
            }
        }

        System.out.println(qFinal);

       return 0;
        
    }

    public static void main(String []args)
    {
        int arr[]={1,2,3,4,5,6,7,8};

        System.out.println(sol(arr));
    }
}