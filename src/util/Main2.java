package util;

public class Main2 {
    public static void main(String[] args) {

        Binaryfarternode g=new Binaryfarternode(3);
        Binaryfarternode f=new Binaryfarternode(7);
        Binaryfarternode e=new Binaryfarternode(4);
        Binaryfarternode d=new Binaryfarternode(1);
        Binaryfarternode c=new Binaryfarternode(8);
        Binaryfarternode b=new Binaryfarternode(2);
        Binaryfarternode a=new Binaryfarternode(5);
        a.setLeft(b);
        a.setRight(c);
        b.setFarter(a);
        b.setLeft(d);
        b.setRight(e);
        c.setFarter(a);
        c.setLeft(f);
        d.setFarter(b);
        e.setFarter(b);
        e.setLeft(g);
        g.setFarter(e);
        f.setFarter(c);

        BinaryFarterNodeTree binaryFarterNodeTree=new BinaryFarterNodeTree(a);
//        binaryFarterNodeTree.midorder(a);
//        System.out.println(binaryFarterNodeTree.findMax(a).getData());
//        System.out.println(binaryFarterNodeTree.findMin(a).getData());
        System.out.println(binaryFarterNodeTree.del(5,a));
        binaryFarterNodeTree.midorder(a);
//        System.out.println(binaryFarterNodeTree.depth(a));
//        binaryFarterNodeTree.insert(6,a,a);
//        binaryFarterNodeTree.midorder(a);

    }}
