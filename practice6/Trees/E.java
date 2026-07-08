// maximum diameter of the tree
//this solution may be wrong
//o(n^2) tc here not optimized

class E
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

    static int maxd=0;


    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int lh=height(root.left);
        int rh=height(root.right);

        return Math.max(lh,rh)+1;

    }
    public static int maxDiameter(Node root)
    {

        if(root==null)
        {
            return 0;
        }
        int lh=maxDiameter(root.left);
        int rh=maxDiameter(root.right);

        int ownDiameter=height(root.left)+height(root.right)+1;

        maxd=Math.max(ownDiameter,lh);
        maxd=Math.max(maxd,rh);
        return maxd;
    }

    public static void main(String []args)
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        Node root=E.buildTree(nodes);

        System.out.println(root.data);
        System.out.println(root.left.data);

        System.out.println(maxDiameter(root));

        
    }
}