// Tree traversal prefix, postfix, inorder

class C
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

    public static Node buildTree(int[] nodes)
    {

            index++;

            if(nodes[index]==-1)
            {
                return null;

            }

            Node n=new Node(nodes[index]);
            n.left=buildTree(nodes);
            n.right=buildTree(nodes);


            return n;
    }

    public static void preOrder(Node root)
    {
        Node t=root;

        if(t==null)
        {
            return;
        }

        System.out.print(t.data+" ");
        preOrder(t.left);
        preOrder(t.right);
        
    }

    

    public static void postOrder(Node root)
    {
        Node t=root;

        if(t==null)
        {
            return;
        }

        postOrder(t.left);
        postOrder(t.right);
        System.out.print(t.data+" ");
    }

    public static void inOrder(Node root)
    {
        Node t=root;

        if(t==null)
        {
            return;
        }

        inOrder(t.left);
        System.out.print(t.data+" ");
        inOrder(t.right);
    }


    public static void main(String []args)
    {

        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};



        Node root=C.buildTree(nodes);
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);


        C.preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        inOrder(root);
    }
}