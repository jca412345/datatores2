package linklist;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class SingleLinkedList<T> {


    private SingleLinkedList<T> headNode;//生成头节点
    private T data;//单链表的数据
    private SingleLinkedList<T> next;//指向下一个节点

    public SingleLinkedList<T> getHeadNode() {
        return headNode;
    }

    public void setHeadNode(SingleLinkedList<T> headNode) {
        this.headNode = headNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public SingleLinkedList<T> getNext() {
        return next;
    }

    public void setNext(SingleLinkedList<T> next) {
        this.next = next;
    }

    public SingleLinkedList() {
        this.headNode = new SingleLinkedList<>(null, null);
    }

    public SingleLinkedList(T data) {
        this.data = data;
    }

    public SingleLinkedList(T data, SingleLinkedList<T> next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "SingleLinkedList{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    //添加节点
    /*
        1.找到最后的节点
        2.添加节点
     */
    public void add(T node) {
        //遍历链表，找到最后
        SingleLinkedList<T> temp = headNode;//辅助遍历
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;//没有找到就后移
        }
        SingleLinkedList<T> tnode = new SingleLinkedList<>(node);
        temp.next = tnode;//添加到最后
    }

    //显示链表
    public void display() {
        //判断链表为空
        if (headNode.next == null) {
            System.out.println("链表为空");
            return;
        }

        SingleLinkedList<T> temp = headNode.next;//辅助遍历
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp.data);
            temp = temp.next;//记得后移
        }
    }

    //这是用来获取属性的发射方法
    private int getByNumber(T data) {
        Class tclass = data.getClass();

        Field[] number = tclass.getDeclaredFields();
        for (Field field : number) {
            if (field.getGenericType().equals(Integer.TYPE)) {
                Method m = null;
                try {
                    m = (Method) data.getClass().getMethod(
                            "get" + getMethodName(field.getName()));
                    Integer val = (Integer) m.invoke(data);
                    if (val != null) {
                        return val;
                    } else {
                        System.err.println("输入的数据改值为空");

                    }
                } catch (Exception e) {
                    System.out.println("没有int属性用来排序");
                    e.printStackTrace();
                }

            }
        }
        return -1;
    }

    // 把一个字符串的第一个字母大写、效率是最高的、主要用来获得属性
    private static String getMethodName(String fildeName) throws Exception {
        byte[] items = fildeName.getBytes();
        items[0] = (byte) ((char) items[0] - 'a' + 'A');
        return new String(items);
    }


    //通过其中第一个默认数值来添加来添加
    public void addByOrder(T data){
        //添加
        //遍历链表，找到合适位置
        SingleLinkedList<T> temp = headNode;//辅助遍历
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (getByNumber(data)<=getByNumber(temp.next.data)){
                break;
            }
            temp=temp.next;
        }
        SingleLinkedList<T> tnode = new SingleLinkedList<>(data);
        tnode.next=temp.next;//先保存后面的节点
        temp.next = tnode;//添加
    }

    //可以根据指定属性排序
    private int getByNumber(T data,String fieldName){
        Class tclass=data.getClass();
        try {
            Method m=(Method) tclass.getMethod("get"+getMethodName(fieldName));
            Integer val=(Integer)m.invoke(data);
            if (val != null) {
                return val;
            } else {
                System.err.println("输入的属性为空!");
            }
        } catch (NoSuchFieldException e) {
            System.out.println("该对象没有这个属性");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }


    //根据标号来修改
    public void update(T node){
        //判断链表是否为空
        if (headNode.next==null){
            System.out.println("链表为空");
            return;
        }
        SingleLinkedList<T> temp = headNode.next;//辅助遍历
        SingleLinkedList<T> LinkNode=new SingleLinkedList<>(node);
        for (;;){
            if (temp==null){
                break;
            }
            if (getByNumber(temp.data,"number")==getByNumber(LinkNode.data,"number")){
                temp.data=LinkNode.data;
                break;
            }
            temp=temp.next;
        }

    }

    //反转单链表
    public void reverse(){
        if (headNode.next==null||headNode.next.next==null){
            return;
        }
        SingleLinkedList cur=headNode.next;//帮助的辅助节点，待会一个一个摘除后面节点时就拼在它的后面
        SingleLinkedList temp=null;//辅助我们遍历
        SingleLinkedList temprecord=new SingleLinkedList();//辅助~最开头的
        SingleLinkedList charge=new SingleLinkedList();//做交换用
        while (cur!=null){
            temp=cur.next;
            //做中间
            charge=temprecord.next;
            temprecord.next=cur;
            cur.next=charge;
            cur=temp;
        }
        headNode.next=temprecord.next;
    }

    //递归打印单链表
    public void reverseBy(SingleLinkedList node){
        if (node.next==null){
            return;
        }
        node=node.next;
        reverseBy(node);
        System.out.println(node.data);

    }


}
