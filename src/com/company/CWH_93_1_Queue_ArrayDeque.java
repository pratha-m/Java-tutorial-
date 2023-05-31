import java.util.ArrayDeque;
public class CWH_93_1_Queue_ArrayDeque {
    public static void main(String[] args) {
        // ArrayDeque<Integer> ad1=new ArrayDeque<>();
        // ad1.add(5);
        // ad1.add(56);
        // ad1.add(9);
        // ad1.addFirst(5);
        // System.out.println(ad1.getFirst());
        // System.out.println(ad1.getLast());


        ArrayDeque<Integer> ad2=new ArrayDeque<>();
        ad2.offer(1);
        ad2.offer(2);
        ad2.offer(3);
        System.out.println(ad2);

        // Array Deque Own Functions :
        // offerFirst()-->add Elemnt at the start 
        // ad2.offerFirst(23);
        // ad2.offerFirst(25);
        // ad2.offerFirst(27);
        // System.out.println(ad2); 

        // offerLast() -->add Element at the last returns null
        // ad2.offerLast(12);
        // ad2.offerLast(15);
        // ad2.offerLast(67);
        // System.out.println(ad2);

        // addFirst()
        // ad2.addFirst(12);
        // ad2.addFirst(13);
        // ad2.addFirst(14);
        // System.out.println(ad2);

        // addLast()
        // ad2.addLast(12);
        // ad2.addLast(13);
        // ad2.addLast(14);
        // System.out.println(ad2);

        // getFirst()
        // System.out.println(ad2.getFirst());
        // System.out.println(ad2);

        // getLast()
        // System.out.println(ad2.getLast());
        // System.out.println(ad2);

        // peekFirst()
        // System.out.println(ad2.peekFirst());

        // peekLast()
        // System.out.println(ad2.peekLast());

        // pollFirst()
        // ad2.pollFirst();
        // System.out.println(ad2);

        // pollLast()
        // ad2.pollLast();
        // System.out.println(ad2);



        // methods of array deque also in queue 
        // offer()  
        // ad2.offer(12);
        // ad2.offer(13);
        // System.out.println(ad2);

        // add()
        // ad2.add(12);
        // ad2.add(13);
        // System.out.println(ad2);

        // clear()
        // ad2.clear();
        // System.out.println(ad2);

        // peek()
        // System.out.println(ad2.peek());
        // System.out.println(ad2);

        // poll()
        // ad2.poll();
        // System.out.println(ad2);
          
        // pop()
        // ad2.pop();
        // System.out.println(ad2);

        // remove()
        // ad2.remove();
        // System.out.println(ad2);
    }
}
