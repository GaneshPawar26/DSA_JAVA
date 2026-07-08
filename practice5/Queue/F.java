//Queue reversal


//we will use stack here

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


class F
{
    public static void queueRev(Queue<Integer> q)
    {
        Stack<Integer> s=new Stack<>();
        int size=q.size();

        for(int i=0;i<size;i++)
        {
            s.push(q.remove());
        }

        for(int i=0;i<size;i++)
        {
            q.add(s.pop());
        }

    
        System.out.println(q);

        return;


    }
    public static void main(String []args)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        queueRev(q);

    }
}