public class BST {
    public class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
        }
    }

    public static node insert(node root,int val){
        if(root==null){
           root=new node(val);
        
        return root;}
        if(root.data>val){
            insert(root.left, val);

        }else
        {
            insert(root.right, val);
        }
      return root;
    }

    public static void main(String args[]) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        System.out.println("dhs");
        System.out.println("hi");
    }
}