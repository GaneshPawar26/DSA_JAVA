import java.util.ArrayList;

import java.util.LinkedList;


public class C
{
    public static void main(String []args)
    {
        ArrayList<Integer> list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);


        LinkedList<Integer> ll=new LinkedList<>();

        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        System.out.println(ll);
    }
}