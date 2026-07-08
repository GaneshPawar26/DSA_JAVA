class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class LL
{

    Node head;

    public void insert(int data)
    {
        Node node=new Node(data);
        if(head==null)
        {
            head=node;
            return;
        }

        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
        return;
    }


    public void print()
    {
        Node temp=this.head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

public class Three
{
    public static void main(String args[])
    {
        LL l=new LL();
        l.insert(10);
        l.insert(20);
        l.insert(30);
        l.print();
    }
}