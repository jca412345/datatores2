package util;

//avl树
public class AvlTree {
    private AvlTreeNode root;

    public AvlTree(AvlTreeNode root) {
        this.root = root;
    }

    public AvlTreeNode getRoot() {
        return root;
    }

    public void setRoot(AvlTreeNode root) {
        this.root = root;
    }
    //树的深度
    public int depth(AvlTreeNode avlTreeNode){
        if (avlTreeNode==null)
            return 0;
        else {
            int left=depth(avlTreeNode.getLeft());
            int right=depth(avlTreeNode.getRight());
            return 1+Math.max(left,right);
        }
    }
    //得到某一点平衡因子
    public int getBalance(AvlTreeNode avlTreeNode){
        if (avlTreeNode.getLeft()==null&&avlTreeNode.getRight()==null){
            return 0;
        }
        else if (avlTreeNode.getLeft()==null){
            return 0-depth(avlTreeNode.getRight());
        }
        else if (avlTreeNode.getRight()==null){
            return depth(avlTreeNode.getLeft());
        }
        else return depth(avlTreeNode.getLeft())-depth(avlTreeNode.getRight());
    }
    //插入avltree
    public AvlTreeNode insert(int value, AvlTreeNode avlTreeNode){
        if (avlTreeNode==null)
            return new AvlTreeNode(value,null,null,null);
        else if (value>avlTreeNode.getData()){
            avlTreeNode.setRight(insert(value,avlTreeNode.getRight()));
        }
        else if (value<avlTreeNode.getData()){
            avlTreeNode.setLeft(insert(value,avlTreeNode.getLeft()));
        }
        else ;
        return balance(avlTreeNode);
    }

    private AvlTreeNode balance(AvlTreeNode avlTreeNode) {
        return null;
    }
}
