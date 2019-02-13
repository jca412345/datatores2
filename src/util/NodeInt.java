package util;

public class NodeInt {
    private int data;
    private NodeInt next;

    public NodeInt() {
    }

    public NodeInt(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public NodeInt getNext() {
        return next;
    }

    public void setNext(NodeInt next) {
        this.next = next;
    }

    public static void printNode(NodeInt head) {
        NodeInt temp=head;
        while (temp.getNext()!=null){
            System.out.println(temp.getData()+",");
            //=this.next;
            temp=temp.getNext();
        }
    }
    public void currentinsert(NodeInt node) {
        this.next=node;
    }
    //删除元素
    public static NodeInt del(NodeInt nodeIntafter,NodeInt nodeIntbefor){
        nodeIntbefor.setNext(nodeIntafter.getNext());
        nodeIntafter.setNext(null);
        return nodeIntafter;
    }

}
