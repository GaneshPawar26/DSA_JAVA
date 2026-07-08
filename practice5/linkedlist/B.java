//length of linkedList


class B
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

    public static Node head;
    public static Node tail;

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

    

    public static int size()
    {
        Node temp=head;
        
        int count=0;
        if(head==null)
        {
            return 0;
        }

        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }


    public static void main(String []args)
    {
        B ll=new B();
       

        ll.addMiddle(10,0);
        ll.addMiddle(20,1);
        ll.addMiddle(30,2);
        ll.addMiddle(40,3);
        ll.addMiddle(50,4);



        int ans=ll.size();
        System.out.println(ans);

    }
}