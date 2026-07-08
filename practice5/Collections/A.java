//doubly linked list


class A
{
    public static class Node
    {
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
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
                return;
            }

            n.next=head;
            n.prev=null;
            head.prev=n;
            head=n;

            return;

        }


        public static void print(Node head)
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+"<->");
                temp=temp.next;

            }
            System.out.println("null");
        }

        public static void main(String args[])
        {
            A ll=new A();

            ll.addNode(10);
            ll.addNode(20);
            ll.addNode(30);
            ll.addNode(40);

            ll.print(head);

            System.out.println(head.next.next.prev.data);
        }



    
}