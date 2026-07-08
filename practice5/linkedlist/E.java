//check if linkedlist is pallendrome or not


class E
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    static void addNode(int data)
    {
        Node n=new Node(data);

        
        if(head==null)
        {
            head=tail=n;
            return;
        }
        n.next=head;
        head=n;
        return;  
    }


    public static void print()
    {
        Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null\n");

        return;

        
    }


    public static boolean pallendrome(Node head)
    {

        while(head==tail || head.next==tail)
        {
            if(head.data==tail.data)
        }

        

        return true;
    }
    public static Node head;
    public static Node tail;

    public static void main(String []args)
    {
        E ll = new E();

        ll.addNode(10);
        ll.addNode(20);
        ll.addNode(40);
        ll.addNode(50);

        ll.print();


        ll.pallendrome(head);

    }
    
}