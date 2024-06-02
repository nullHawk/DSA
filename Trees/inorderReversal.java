package Trees;


public class countRoot {
    int count(root){
        if(root == null)
            return 0;
        return 1 + count(root.left) + count(root.right);
    }
    public static void main(String[] args) {
        
    }
}
