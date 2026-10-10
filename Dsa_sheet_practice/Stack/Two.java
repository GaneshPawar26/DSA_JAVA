//push at the bottom of the stack

import java.util.Stack;

public class Two
{
    public static void addBottom(Stack s1,int data)
    {
         if(s1.isEmpty())
            {
                s1.push(data);
                return;
            }

            int x=(int)s1.pop();
            addBottom(s1,data);
            s1.push(x);
    }

   public static void main(String args[])
   {
        System.out.println("Pushing elelment at the bottom of the stack");

        Stack<Integer> s1=new Stack<>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        System.out.println(s1);

        addBottom(s1,40);
        System.out.println(s1);
        
   } 
}