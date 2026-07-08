package M4;

import java.util.ArrayList;

class Numbers
{
    ArrayList<Integer> a1;
    public Numbers()
    {
        a1=new ArrayList<>();
    }
    

    public void add(int i)
    {
        a1.add(i);
    }


}


public class One {

    public static void main(String args[])
    {
        Numbers n=new Numbers();
        
        System.out.println(n.a1);
        n.add(10);
        n.add(11);
        n.add(12);
        System.out.println(n.a1);
    }
    
}
