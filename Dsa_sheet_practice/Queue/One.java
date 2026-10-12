import java.util.LinkedList;
import java.util.Queue;


public class One
{
    public static void main(String aargs[])
    {
        Queue<Integer> q=new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);

        

        System.out.println("This is Queue");
        System.out.println(q.peek());
        System.out.println(q);
    }
}