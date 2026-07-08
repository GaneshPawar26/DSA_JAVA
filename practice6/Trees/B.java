// we can only build tree by preorder or
// Given	Can Build Unique Tree?
// Inorder + Preorder	✅ Yes
// Inorder + Postorder	✅ Yes

// so below code is wrong


class B
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
    public static Node buildTree(int[] node)
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

    public static void main(String []args)
    {
        int nodes[]={-1,4,-1,2,-1,5,-1,1,-1,3,-1,6,-1};

        B tree=new B();
        Node root=tree.buildTree(nodes);

        System.out.println(root.data);
        
    }
}