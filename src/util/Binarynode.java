package util;

//普通的二叉树
public class Binarynode{
    private Integer root;
    private Binarynode left;
    private Binarynode right;

    public Binarynode(Integer root, Binarynode left, Binarynode right) {
        this.root = root;
        this.left = left;
        this.right = right;
    }

    public Binarynode(Integer root, Binarynode left) {
        this.root = root;
        this.left = left;
    }

    public Binarynode(Integer root) {
        this.root = root;
    }

    public Integer getRoot() {
        return root;
    }

    public void setRoot(Integer root) {
        this.root = root;
    }

    public Binarynode getLeft() {
        return left;
    }

    public void setLeft(Binarynode left) {
        this.left = left;
    }

    public Binarynode getRight() {
        return right;
    }

    public void setRight(Binarynode right) {
        this.right = right;
    }

}
