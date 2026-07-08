//reverse a linked list--my way extra ll created here


class D
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
    public static Node tail1;
    public static Node head1;


    public static Node reverse()
    {
        Node temp=head.next;
        head1=new Node(head.data);
        while(temp!=null)
        {
            Node n=new Node(temp.data);

            n.next=head1;
            head1=n;
            temp=temp.next;
        }

        return head1;
    }

    public static void main(String []args)
    {
        Node e1=new Node(10);
        Node e2=new Node(20);
        Node e3=new Node(30);
        Node e4=new Node(40);

        e1.next=e2;
        e2.next=e3;
        e3.next=e4;

        head=e1;

        Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null\n");


        Node temp1=reverse();

        while(temp1!=null)
        {
            System.out.print(temp1.data+"->");
            temp1=temp1.next;
        }
        System.out.print("null\n");


    }
}