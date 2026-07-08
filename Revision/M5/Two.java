// package M5;

class Node
{
    int data;
    Node next;

    public Node(int data)
    {   
        this.data=data;
        this.next=null;
    }

}

class Ll
{
    Node front;

    public void add(int data)
    {
        Node node=new Node(data);

        Node temp=front;

        if(temp==null)
        {
            front=node;
            return;
        }

        while(temp.next!=null)
        {
            temp=temp.next;
        }

        temp.next=node;
    }

    public void print(Ll l)
    {
        Node temp=front;

        while(temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    


}

public class Two {
    
    public static void main(String args[])
    {

        Ll ll=new Ll();
        ll.add(10);
        ll.add(11);
        ll.add(13);
        ll.print(ll);
    }
}
