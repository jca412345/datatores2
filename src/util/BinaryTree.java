package util;

import java.util.Stack;

public class BinaryTree {
    //
    private Binarynode root;

    public Binarynode getRoot() {
        return root;
    }

    public void setRoot(Binarynode root) {
        this.root = root;
    }
    //初始化树
    public Binarynode init(){
        Binarynode j=new Binarynode(2);
        Binarynode i=new Binarynode(7);
        Binarynode h=new Binarynode(8);
        Binarynode g=new Binarynode(4);
        Binarynode f=new Binarynode(9,j);
        Binarynode e=new Binarynode(6,i);
        Binarynode d=new Binarynode(5,g,h);
        Binarynode c=new Binarynode(17,null,f);
        Binarynode b=new Binarynode(19,d,e);
        Binarynode a=new Binarynode(21,b,c);
        return a;
    }
    //打印root值
    public void printroot(Binarynode binarynode){
        System.out.println(binarynode.getRoot());
    }

    //先序遍历
    public void preorder(Binarynode binarynode){
       printroot(binarynode);
       if (binarynode.getLeft()!=null){
           preorder(binarynode.getLeft());
       }
       if (binarynode.getRight()!=null){
           preorder(binarynode.getRight());
       }

    }
    public void theFirstTraversal_Stack(Binarynode binarynode) {  //先序遍历
        Stack<Binarynode> stack = new Stack<Binarynode>();
        Binarynode b = binarynode;
        while (b != null || stack.size() > 0) {  //将所有左孩子压栈
            if (b != null) {   //压栈之前先访问
                printroot(b);
                stack.push(b);
                b = b.getLeft();
            } else {
                b = stack.pop();
                b = b.getRight();
            }
        }
    }
}
