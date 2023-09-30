import java.util.*;

public class Program {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<Integer>();
        System.out.println(lst);

        lst.add(1);
        lst.add(2);
        lst.add(3);
        System.out.println(lst);

        lst.remove(0);
        System.out.println(lst);

        lst.addLast(8);
        System.out.println(lst);

        Queue<Integer> lst2 = new LinkedList<Integer>();
        System.out.println(lst2);

        lst2.add(1);
        lst2.add(2);
        lst2.add(3);
        System.out.println(lst2);

        System.out.println(lst2);

        PriorityQueue<Integer> lst3 = new PriorityQueue<Integer>();
        lst3.add(10);
        lst3.add(2);
        lst3.add(7);
        lst3.add(1);
        System.out.println(lst3);
        System.out.println(lst3.poll());
        System.out.println(lst3.poll());
        System.out.println(lst3.poll());

        Deque<Integer> lst4 = new ArrayDeque<>();
        lst4.addFirst(1);
        lst4.addLast(2);
        lst4.addFirst(3);
        lst4.addLast(4);
        lst4.removeLast();
//        lst4.removeLast();
//        lst4.offerFirst(1);
//        lst4.offerLast(2);

//        lst4.pollFirst();
//        lst4.pollLast();
//        lst4.getFirst();
//        lst4.getLast();
//        lst4.peekFirst();
//        lst4.peekLast();

        System.out.println(lst4);
    }
}