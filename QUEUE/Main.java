package QUEUE;

public class Main {
    public static void main(String[] args) {
        System.out.println("Standard Queue");
        MyQueue sq = new MyQueue();
        sq.enQueue(3);
        sq.enQueue(4);
        sq.deQueue();
        System.out.println(sq.Front());

        System.out.println("Circular Queue");
        MyCircularQueue cq = new MyCircularQueue(5);
        cq.enQueue(5);
        cq.enQueue(22);
        cq.deQueue();
        System.out.println(cq.Front());
    }
}
