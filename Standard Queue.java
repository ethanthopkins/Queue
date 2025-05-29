import java.util.ArrayList;
import java.util.List;

//Queues are FIFO

class MyQueue {
    private List<Integer> data;
    private int p_start;

    public MyQueue() {
        data = new ArrayList<Integer>();
        p_start = 0;
    }
    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }
    public boolean deQueue() {
        if (isEmpty() == true) {
            return false;
        }
        p_start++;
        return true;
    }
    public int Front() {
        return data.get(p_start);
    }
    public boolean isEmpty() {
        return p_start >= data.size();
    }
}

//unit tests
public class Main {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        System.out.println(q.Front());
        if (q.isEmpty() == false) {
            q.deQueue();
        }
        q.enQueue(17);
        System.out.println(q.Front());

        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.Front());
        }
    }
}