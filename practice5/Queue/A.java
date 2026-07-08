import java.util.Queue;

class A
{
    public static void main(String args[])
    {
        Queue<Integer> q = new Queue<>();


        q.add(10);
        q.add(20);
        q.add(30);
       
        System.out.println(q);
        q.remove();
    }
}