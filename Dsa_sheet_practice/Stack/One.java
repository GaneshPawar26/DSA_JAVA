import java.util.Collection;
import java.util.Stack;


public class One {
    public static void main(String args[])
    {
        Stack<Integer> s=new Stack<>();
        s.add(10);
        s.add(20);
        s.add(30);
        System.out.println("hello world learning the stack");
        System.out.println(s.pop());
        System.out.println(s);
        s.push(30);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);


    }
}
