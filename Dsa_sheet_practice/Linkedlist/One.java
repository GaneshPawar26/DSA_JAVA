// package Linkedlist;

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

class Linkedlist
{
    Node head;
    Node tail;

  public void addFirst(int data)
  {
    Node n=new Node(data);

    if(head==null)
    {
        head=tail=n;
    }
    else{
        n.next=head;
        head=n;
    }
      return;
  }  


  public void print()
  {
    if(head==null)
    {
        System.out.println("Linkedlist is empty");
    }
    else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                System.out.print(temp.data + "->");
                temp=temp.next;
            }
            System.out.println(temp.data+"->null");
        }

  }
}

public class One
{
    public static void main(String args[])
    {

        Linkedlist ll=new Linkedlist();
        ll.addFirst(4);
        ll.print();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.println("hii Boss");

    }
}