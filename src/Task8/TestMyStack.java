package Task8;

public class TestMyStack {
    public static void main(String[] args) {
        MyIntStack st1 = new MyIntStack(10);
        for (int i = 0; i < 10; i++)
            st1.push(i);
        System.out.println(st1.isEmpty());
        System.out.println(st1.isFull());
        System.out.println(st1.peek());
        System.out.println(st1.isFull());
        st1.pushF(10);
        System.out.println(st1.pop());
        System.out.println(st1.peek());
    }
}
