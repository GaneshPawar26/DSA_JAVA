//detecting cycle in a linked list-flyod algorithm

//we use slow fast approach here
//make program of removing cycle


class B
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
        }


        public static boolean checkCycle()
        {
            Node slow=head;
            Node fast=head;


            

            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;

                if(slow==fast)
                {
                    return true;
                }
                
                

            }
            return false;
            

        }

        public static void main(String []args)
        {

            B ll=new B();

            ll.addNode(10);
            ll.addNode(20);
            ll.addNode(30);
            ll.addNode(40);

            ll.print();

            boolean ans=ll.checkCycle();

            System.out.println(ans);

        

        }
    


    
}