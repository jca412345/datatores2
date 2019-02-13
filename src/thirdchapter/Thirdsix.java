package thirdchapter;


import util.NodeInt;

public class Thirdsix {
    /**
     * 约瑟夫
     * @param n 代表人数
     * @param m 代表次数
     */
    public void josephus(int n,int m){

        NodeInt[] node = new NodeInt[n];
        for (int i=0;i<n;i++){
            NodeInt nodetemp=new NodeInt(i+1);
            node[i]=nodetemp;
        }
        for (int i=0;i<n-1;i++){
            node[i].currentinsert(node[i+1]);//围成1条
        }
//        for (int i=0;i<n;i++)
//        System.out.println(node[i].getData());
        node[n-1].currentinsert(node[0]);//围成圈
//        NodeInt.printNode(node[0]);
        NodeInt.del(node[4],node[3]);
//        NodeInt.printNode(node[0]);
        for (int i=0;i<n;i++)
        System.out.println(node[i].getData());
    }
}
