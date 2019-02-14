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
//        binaryTree.preorder(a);
        System.out.println(binaryTree.depth(a));
    }

}
