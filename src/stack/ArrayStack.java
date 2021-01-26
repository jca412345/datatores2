package stack;

public class ArrayStack {
    private int maxSize;//栈的大小
    private Object[] stack;//数组模拟
    private int top = -1;//标识栈顶

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public Object[] getStack() {
        return stack;
    }

    public void setStack(Object[] stack) {
        this.stack = stack;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        this.stack=new Object[maxSize];
    }

    //判断占满
    public boolean isFull(){
        return top==maxSize-1;
    }
    //判断栈空
    public boolean isEmpty(){
        return top==-1;
    }
    //入栈
    public void push(Object value){
        if (isFull()){
            System.out.println("栈满");
            return;
        }
        top++;
        stack[top]=value;
    }
    //出栈
    public Object pop(){
        if (isEmpty()){
            throw new RuntimeException("栈空");
        }
        Object value=stack[top];
        top--;
        return value;
    }
    //遍历，从栈顶开始遍历
    public void list(){
        if (isEmpty()){
            System.out.println("没有数据");
        }
        for (int i=top;i>-1;i--){
            System.out.println(stack[i]);
        }
    }
}
