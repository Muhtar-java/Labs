package Task8;

public class MyIntStack {
    private int[] contents;
    private int tos;  // Top of the stack
    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }
    public boolean push(int element) {
        if(this.isFull()) {
            System.out.println("Stack is full");
            return false;}
        else {
            contents[++tos] = element;
            return true;}
    }
    public void pushF(int element) {
        int [] contents1 = contents;
        contents = new int[contents.length + 1];
        for(int i=0; i < contents1.length; i++)
            contents[i] = contents1[i];
        this.push(element);
    }
    public int pop() {
        return contents[tos--];
    }
    public int peek() {
        return contents[tos];
    }
    public boolean isEmpty() {
        return tos < 0;
    }
    public boolean isFull() {
        return tos == contents.length - 1;
    }
}
