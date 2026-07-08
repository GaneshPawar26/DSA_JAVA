//Queue using two stacks
//stack using 2 queues

import java.util.Stack;


class C
{
    public static void main(String []args)
    {
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();


        s1.push(10);
        s1.push(20);
        s1.push(30);

        s2.push(60);
        s2.push(70);
        s2.push(80);


        System.out.println(s1+" "+s2);

        
    }
}