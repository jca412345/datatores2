package util;

//测试avl树
public class Main3 {
    public static void main(String[] args) {
        AvlTreeNode a=new AvlTreeNode(4);
        AvlTreeNode b=new AvlTreeNode(2);
        AvlTreeNode c=new AvlTreeNode(5);
        AvlTreeNode d=new AvlTreeNode(1);
        AvlTreeNode e=new AvlTreeNode(3);
        a.setLeft(b);
        a.setRight(c);
        a.setFather(null);
        b.setFather(a);
        b.setLeft(d);
        b.setRight(e);
        c.setFather(a);
        d.setFather(b);
        d.setFather(b);
        AvlTree avlTree=new AvlTree(a);

//        System.out.println(avlTree.depth(a));
//        a.setHeight(avlTree.depth(a.getLeft())-avlTree.depth(a.getRight()));
//        System.out.println(a.getHeight());
//        avlTree.midBalace(a);
        System.out.println(a.getHeight());
    }


}
