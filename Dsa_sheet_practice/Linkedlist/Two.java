import java.util.LinkedList;

public class Two
{
    public static void main(String args[])
    {
        LinkedList<Integer> ll=new LinkedList<>();

        System.out.println(ll);

        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println(ll);

        LinkedList<Integer> ll2=new LinkedList<>();

        ll2.add(1);
        ll2.add(2);
        ll2.add(3);

        System.out.println(ll2);

        ll.addAll(ll2);
        System.out.println(ll);

    }
}