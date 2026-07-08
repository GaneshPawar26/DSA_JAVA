class LinkedList
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



    public static Node head;
    public static Node tail;

    public static void addNode(int data)
    {
        Node n=new Node(data);

        if(head==null)
        {
            head=tail=n;

        }
        else
        {
            n.next=head;
            head=n;
        }
        return;
        
    }

    public static void addAtEnd(int data)
    {
        Node n=new Node(data);
        if(head==null)
        {
            head=tail=n;
        }

        tail.next=n;
        tail=n;
    }

    public static void print()
    {
        Node temp=head;

        if(head==null)
        {
            System.out.println("Empty linkedList");
        }
        else{
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println("");
        }

    }

    public static void main(String []args)
    {

        LinkedList ll=new LinkedList();
        ll.print();
        ll.addNode(26);
        ll.addNode(1);
        ll.print();
        ll.addNode(6);
        ll.print(); 

        System.out.println(ll.tail.data);
    }
}