//add element in the middle of linkedlist at the given index

class C
{

    public static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public static void addMiddle(int data,int index)
    {
        int count=0;
        Node n=new Node(data);
        Node temp=head;
        if(count==index)
        {
            head=tail=n;
            return;
        }

        
            while(count<index-1)
            {
                if(temp==null)
                {
                    System.out.println("Out of index of linkedlist");
                    return;
                }
                temp=temp.next;
                count++;
            }

            n.next=temp.next;
            temp.next=n;

            return;


    }

    public static Node head;
    public static Node tail;


    public static void print()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("Empty ll");
            return;
        }

        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
        return;
    }


    public static void main(String []args)
    {
        C ll=new C();
        ll.print();

        ll.addMiddle(10,0);
        ll.addMiddle(20,1);
        ll.addMiddle(30,2);
        ll.addMiddle(40,3);
        ll.addMiddle(50,4);

       
      
        ll.print();
        ll.addMiddle(40,2);
        ll.print();

        ll.addMiddle(40,23);

    }


}
