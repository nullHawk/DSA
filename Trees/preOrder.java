class BinaryTree {
    public int data;
    public BinaryTree left;
    public BinaryTree right;
    
    BinaryTree(int val){
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
public class preOrder{
    static void preoder(BinaryTree node){
        if(node == null) return;
        System.out.print(node.data + " ");
        preoder(node.left);
        preoder(node.right);
    }
    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(3);
        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);
        root.right.left = new BinaryTree(6);
        root.right.right = new BinaryTree(7);
        preoder(root);
    }
}