package linklist;

import java.util.concurrent.ThreadPoolExecutor;

//用来测试数据的class
public class Hero {
    private int number;
    private String name;

    public Hero(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

}
