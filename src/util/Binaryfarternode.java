package util;

/**
 * 带有父节点的二叉树，只实现删除
 */
public class Binaryfarternode {
    private int data;//数据源
    private Binaryfarternode farter;

    public Binaryfarternode() {
    }

    private Binaryfarternode left;
    private Binaryfarternode right;

    public Binaryfarternode(int data) {
        this.data = data;
    }

    public Binaryfarternode(int data, Binaryfarternode farter, Binaryfarternode left, Binaryfarternode right) {
        this.data = data;
        this.farter = farter;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Binaryfarternode getFarter() {
        return farter;
    }

    public void setFarter(Binaryfarternode farter) {
        this.farter = farter;
    }

    public Binaryfarternode getLeft() {
        return left;
    }

    public void setLeft(Binaryfarternode left) {
        this.left = left;
    }

    public Binaryfarternode getRight() {
        return right;
    }

    public void setRight(Binaryfarternode right) {
        this.right = right;
    }
}
