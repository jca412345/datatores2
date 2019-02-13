package util;

/**
 *循环链表（int）
 */
public class Node implements NodeInterface{
    public Object data;//存放值
    public Node next;//

    public Node(Object data) {
        this.data = data;
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public int size() {
        return 0;
    }

    public Node() {
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void insert(int index, Node node) {

    }

    @Override
    public void insert(Node node) {
        Node head=new Node(-1);
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
    }

    @Override
    public void currentinsert(Node node) {
        this.next=node;
    }

    @Override
    public void delete(int index) {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public void printNode(Node head) {
        Node temp=head;
        while (temp.next!=null){
            System.out.println(this.data+",");
            //=this.next;
            temp=temp.next;
        }
    }

    @Override
    public boolean hasNext(){
        return this.next != null;
    }
//    public void

}
