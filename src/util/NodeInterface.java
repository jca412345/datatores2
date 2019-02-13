package util;

//线性表接口

public interface NodeInterface {
    //获得线性表长度
     int size();

    //判断线性表是否为空
     boolean isEmpty();

    //插入元素
     void insert(int index, Node node);

     //尾部
     void insert(Node node);

     void currentinsert(Node node);
    //删除元素
     void delete(int index);

    //获取指定位置的元素
     Object get(int index);

     //遍历线性表
    void printNode(Node head);

    boolean hasNext();
}
