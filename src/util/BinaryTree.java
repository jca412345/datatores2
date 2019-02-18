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
    //中序遍历
    public void midorder(Binarynode binarynode){
        if (binarynode.getLeft()!=null){
            midorder(binarynode.getLeft());
        }
        printroot(binarynode);
        if (binarynode.getRight()!=null){
            midorder(binarynode.getRight());
        }

    }
    //插入(选择指定节点插入到左子树)
    public void insertLeft(Binarynode insertnode,Binarynode value){
        value.setLeft(insertnode.getLeft());
        insertnode.setLeft(value);
    }
    //右边
    public void insertRight(Binarynode insertnode,Binarynode value){
        value.setRight(insertnode.getRight());
        insertnode.setRight(value);
    }
    //树的深度(错误的写法)
    public int depth(Binarynode binarynode){
        int count=1;
        Binarynode point=binarynode;
        while (point!=null){
            if (point.getLeft()!=null){
                point=point.getLeft();
                count++;
            }
            else if (point.getRight()!=null){
                point=point.getRight();
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }

    /**
     * 查询某数是否在树中
     * @param param
     * @param binarynode(从这个节点开始)
     * @return
     */
    public boolean querynode(int param,Binarynode binarynode){
        int flag=-1;
        if (binarynode==null)
            return false;
        if (binarynode.getRoot()==param){
            flag=1;
        }
        if (flag!=1){
            return querynode(param,binarynode.getLeft());

        }if (flag!=1){
            return querynode(param,binarynode.getRight());
        }
        else
            return true;
    }

    //按照二叉查找树进行插入
    public Binarynode insert(int insertvalue,Binarynode rootnode){
        if (rootnode==null){
            return new Binarynode(insertvalue,null,null);
        }
        if (insertvalue<rootnode.getRoot()){

            rootnode.setLeft(insert(insertvalue,rootnode.getLeft()));
        }
        else if (insertvalue>rootnode.getRoot()){

            rootnode.setRight(insert(insertvalue,rootnode.getRight()) );
        }
        else ;//等于的情况
        return rootnode;
    }
    //查找最小值
    public Binarynode findMin(Binarynode binarynode){
        if (binarynode==null)
            return null;

        while (binarynode.getLeft()!=null){
            binarynode=binarynode.getLeft();
        }
        return binarynode;
    }

    //删除最小值（未完成）
    public Binarynode removeMin(Binarynode binarynode){
        if (binarynode==null)
            return new Binarynode(-1,null,null);
        binarynode.setLeft(removeMin(binarynode.getLeft()));
        return binarynode;

    }
    //二叉树中删除（未完成）
    public Binarynode del(int value,Binarynode binarynode){
        if (binarynode==null)
            return binarynode;
        if (value<binarynode.getRoot()){
            binarynode.setLeft(del(value,binarynode.getLeft()));
        }
        else if (value>binarynode.getRoot()){
            binarynode.setRight(del(value,binarynode.getRight()));
        }
        else if (binarynode.getRight()!=null){//只要有右节点
            binarynode.setRoot(findMin(binarynode.getRight()).getRoot());//替换
            removeMin(binarynode);//移除
        }
        else if (binarynode.getLeft()!=null)//左节点
        {
            binarynode.setRoot(binarynode.getLeft().getRoot());
        }
        else {

        }
        return binarynode;

    }
}
