package util;

public class BinaryFarterNodeTree {
    public BinaryFarterNodeTree(Binaryfarternode root) {
        this.root = root;
    }

    public Binaryfarternode getRoot() {
        return root;
    }

    public void setRoot(Binaryfarternode root) {
        this.root = root;
    }

    private Binaryfarternode root;

    //中序遍历
    public void midorder(Binaryfarternode binaryfarternode){
        if (binaryfarternode==null){
            System.out.println("这是一棵空树");
        }
        if (binaryfarternode.getLeft()!=null){
            midorder(binaryfarternode.getLeft());
        }
        print(binaryfarternode);
        if (binaryfarternode.getRight()!=null){
            midorder(binaryfarternode.getRight());
        }
    }
    //打印当前节点
    public void print(Binaryfarternode binaryfarternode){
        System.out.println(binaryfarternode.getData());
    }
    //删除节点(存在再删除)
    public int del(int value,Binaryfarternode binaryfarternode){

        if (binaryfarternode==null){
            return 0;
        }

        if (value==binaryfarternode.getData()&&binaryfarternode.getFarter()!=null){

            binaryfarternode.setData(findMin(binaryfarternode).getData());//修改值
            Binaryfarternode farter=findMin(binaryfarternode).getFarter();//删除值
            //如果最小值没有右节点
            if (findMin(binaryfarternode).getRight()==null){
                farter.setLeft(null);
            }
            //有右节点
            else if (findMin(binaryfarternode).getRight()!=null){
                farter.setLeft(findMin(binaryfarternode).getRight());
            }
            return 1;
        }
        else if (value==binaryfarternode.getData()&&binaryfarternode.getFarter()==null){//处理删除根节点
//            binaryfarternode.setData(value);
            findMax(binaryfarternode.getLeft());//找出左边最大的节点
            System.out.println("删除的是根节点");
            return 1;
        }
        else if (value<binaryfarternode.getData()){
            return del(value,binaryfarternode.getLeft());
        }
        else {
            return del(value,binaryfarternode.getRight());
        }

    }
    //寻找最大的节点
    public Binaryfarternode findMax(Binaryfarternode binaryfarternode){
        if (binaryfarternode==null){
            return null;
        }
        else if (binaryfarternode.getRight()==null){
            return binaryfarternode;
        }
        else
            return findMax(binaryfarternode.getRight());
    }
    //寻找最小的节点
    public Binaryfarternode findMin(Binaryfarternode binaryfarternode){
        if (binaryfarternode==null){
            return null;
        }
        else if (binaryfarternode.getLeft()==null){
            return binaryfarternode;
        }
        else
            return findMin(binaryfarternode.getLeft());
    }
    //树的深度
    public int depth(Binaryfarternode binaryfarternode){
        if (binaryfarternode==null){
            return 0;
        }
        else{
            int left=depth(binaryfarternode.getLeft());
            int right=depth(binaryfarternode.getRight());
            return 1+Math.max(left,right);
        }
    }
    //二叉树的方式插入
    public Binaryfarternode insert(int value,Binaryfarternode binaryfarternode,Binaryfarternode binaryfarternode1){
        if (binaryfarternode==null){
            return new Binaryfarternode(value,binaryfarternode1,null,null);
        }
        if (value<binaryfarternode.getData()){
            binaryfarternode.setLeft(insert(value,binaryfarternode.getLeft(),binaryfarternode));
        }
        else if (value>binaryfarternode.getData()){
            binaryfarternode.setRight(insert(value,binaryfarternode.getRight(),binaryfarternode));
        }
        else ;
        return binaryfarternode;
    }
    //平衡AVL树,同样适合于有关根节点的问题
    public void balance(Binaryfarternode binaryfarternode){

    }
    //树的宽度
    public int wildth(Binaryfarternode binaryfarternode){
        return 0;
    }
}
