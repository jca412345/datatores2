package util;

public class Main {
    public static void main(String[] args) {
        Node node=new Node("abc");
        node.insert(node);
//        node.printNode();
        BinaryTree binaryTree=new BinaryTree();
//        binaryTree.preorder(binaryTree.init());
        binaryTree.theFirstTraversal_Stack(binaryTree.init());

    }

}
