package util;

import java.util.Stack;

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
    //为所有节点设置平衡因子
    public void midBalace(AvlTreeNode avlTreeNode){
        if (avlTreeNode==null){
            System.out.println("此树为空");
        }
        Stack<AvlTreeNode> stack=new Stack<>();
        while (!stack.isEmpty()||avlTreeNode!=null){

        }
    }
}
