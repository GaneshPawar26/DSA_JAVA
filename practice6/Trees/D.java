// level order travesal of tree
//did by myself check maam implementation

import java.util.LinkedList;
import java.util.Queue;


class D
{
    public static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }


    public static int index=-1;
    public static Node buildTree(int []node)
    {
        index++;

        if(node[index]==-1)
        {
            return null;
        }

        Node n=new Node(node[index]);
        n.left=buildTree(node);
        n.right=buildTree(node);

        return n;

    }

    
    public static void levelOrder(Node root,Queue<Node> q)
    {
        if(root==null)
        {
            return;
        }
        Node t=q.remove();

        if(t.left==null)
        {
            if(t.right==null)
            {

            }
            else
            {
                q.add(t.right);
            }

        }
        else
        {
            if(t.right==null)
            {
                q.add(t.left);
            }
            else
            {
                q.add(t.left);
                q.add(t.right);
            }
        }
       
        

        // Node t=q.remove();

        // System.out.println(t.data);

        System.out.print(t.data+" ");
        t=q.peek();
        levelOrder(t,q);
    }


    public static void main(String []args)
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=buildTree(nodes);
        System.out.println(root.data);


        Queue<Node> q=new LinkedList<>();

        q.add(root);

        levelOrder(root, q);
    }
}