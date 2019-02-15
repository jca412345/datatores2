package util;

public class Main {
    public static void main(String[] args) {
        Node node=new Node("abc");
        node.insert(node);
//        node.printNode();
        BinaryTree binaryTree=new BinaryTree();
//        binaryTree.preorder(binaryTree.init());
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
//        binaryTree.theFirstTraversal_Stack(binaryTree.init());
        binaryTree.setRoot(a);
        Binarynode k=new Binarynode(233);
        binaryTree.insertLeft(b,k);
//        binaryTree.midorder(a);
//        System.out.println(binaryTree.depth(a));

//        System.out.println(binaryTree.querynode(5,a));
//        System.out.println(binaryTree.querynode(233,a));
//        System.out.println(binaryTree.querynode(4,a));


        //构造一颗二叉查找树
        Binarynode bk6=new Binarynode(3);
        Binarynode bk5=new Binarynode(4,bk6);
        Binarynode bk4=new Binarynode(1);
        Binarynode bk3=new Binarynode(8);
        Binarynode bk2=new Binarynode(2,bk4,bk5);
        Binarynode bk1=new Binarynode(6,bk2,bk3);

        BinaryTree queryTree=new BinaryTree();
        queryTree.setRoot(bk1);
//        System.out.println(queryTree.insert(5,bk1).getRoot());
//        queryTree.midorder(bk1);
//        queryTree.midorder(bk1);
//        System.out.println(queryTree.removeMin(bk1));

        queryTree.midorder(bk1);
//        System.out.println(queryTree.del(3,bk1));
//        System.out.println(queryTree.findMin(bk1));

    }

}
