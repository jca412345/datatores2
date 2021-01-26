package linklist;

import static org.junit.Assert.*;

public class SingleLinkedListTest {

    @org.junit.Test
    public void add() {
        Hero hero1=new Hero(1,"宋江");
        Hero hero2=new Hero(2,"宋江2");
        Hero hero3=new Hero(3,"宋江3");
        SingleLinkedList<Hero> heroList=new SingleLinkedList<Hero>();
        heroList.add(hero1);
        heroList.add(hero2);
        heroList.add(hero3);
        //
        heroList.display();
    }

    @org.junit.Test
    public void display() {
    }

    @org.junit.Test
    public void addByOrder(){
        SingleLinkedList<Hero> heroList=new SingleLinkedList<Hero>();
        Hero hero4=new Hero(4,"宋江4");
        heroList.addByOrder(hero4);
        heroList.display();

//        Hero hero6=new Hero(6,"宋江6");
        Hero hero2=new Hero(2,"宋江2");
//        heroList.addByOrder(hero6);
        heroList.addByOrder(hero2);
        heroList.display();

        Hero hero3=new Hero(3,"宋江3");
        heroList.addByOrder(hero3);
        heroList.display();
    }
    @org.junit.Test
    public void update(){
        Hero hero1=new Hero(1,"宋江");
        Hero hero2=new Hero(2,"宋江2");
        Hero hero3=new Hero(3,"宋江3");
        SingleLinkedList<Hero> heroList=new SingleLinkedList<Hero>();
        heroList.add(hero1);
        heroList.add(hero2);
        heroList.add(hero3);
        Hero hero4=new Hero(2,"宋江江3");
        heroList.update(hero4);
        heroList.display();
    }

    //反转单链表
    @org.junit.Test
    public void reverse(){
        Hero hero1=new Hero(1,"宋江");
        Hero hero2=new Hero(2,"宋江2");
        Hero hero3=new Hero(3,"宋江3");
        SingleLinkedList<Hero> heroList=new SingleLinkedList<Hero>();
        heroList.add(hero1);
        heroList.add(hero2);
        heroList.add(hero3);
        heroList.reverse();
        heroList.display();
    }
    //反向打印
    @org.junit.Test
    public void reverseBy(){
        Hero hero1=new Hero(1,"宋江");
        Hero hero2=new Hero(2,"宋江2");
        Hero hero3=new Hero(3,"宋江3");
        SingleLinkedList<Hero> heroList=new SingleLinkedList<Hero>();
        heroList.add(hero1);
        heroList.add(hero2);
        heroList.add(hero3);
        heroList.reverseBy(heroList.getHeadNode());
        heroList.display();
//        heroList.display();
    }
}