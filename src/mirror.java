public class mirror {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void swap(node root) {
            if (root == null) {
                return;
            }
            node temp = root.left;
            root.left = root.right;
            root.right = temp;
        }

        public static void preorder(node root) {
            if (root == null) {
                return;
            }
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
        public static void mirror(node root)
        {
            if(root==null)
            {
                return;
            }
            mirror(root.left);
            mirror(root.right);
            swap(root);
        }

    public static void main(String[] args) {

        node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        preorder(root);
        System.out.println();
        mirror(root);
        preorder(root);


    }
}
