//making tree in preorder fashion


class A
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

    static int index=-1;
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


    public static void main(String []args)
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        A tree=new A();
        Node root=tree.buildTree(nodes);

        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);

    }
}