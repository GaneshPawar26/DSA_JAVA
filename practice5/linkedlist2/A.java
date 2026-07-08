

class LinkedList
{


    public class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    Node head;
    Node tail;

    void print()
    {
        Node temp=head;

        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}


class A
{
    public static void main(String []args)
    {
        LinkedList ll=new LinkedList();


        LinkedList.Node n1=ll.new Node(20);
        ll.head=n1;
        
        ll.print();

    }
}