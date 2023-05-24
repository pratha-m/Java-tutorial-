import java.util.LinkedList;

public class CWH_92_LinkedList {
    public static void printLinkedList(LinkedList<Integer> l){
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
   public static void main(String[] args) {
    LinkedList<Integer> l1=new LinkedList<>(); 
    l1.add(6);
    l1.add(7);
    l1.add(4);
    l1.add(6);
    l1.add(5);
    LinkedList<Integer> l2=new LinkedList<>();
    l2.add(15);
    l2.add(16);
    l2.add(17);
    l2.add(18);
    
    // Methods in linkedList not in arrayList: 
    // l1.addLast(67);
    // printLinkedList(l1);
    
    // l1.addFirst(88);
    // printLinkedList(l1);

    // Methods Same in linkedList and arrayList :
    // printLinkedList(l1);
    // System.out.println();
    // l1.add(0,5);
    // printLinkedList(l1);


    // l1.addAll(2,l2);
    // printLinkedList(l1);

    // l1.clear();
    // printLinkedList(l1);

    // System.out.println(l1.contains(1));
    // System.out.println(l1.contains(6));

    // System.out.println(l1.indexOf(1));
    // System.out.println(l1.indexOf(5));
    // System.out.println(l1.indexOf(6));

    // System.out.println(l1.lastIndexOf(6));
    // System.out.println(l1.lastIndexOf(5));

    // printLinkedList(l1);
    // l1.remove(2);
    // l1.remove(3);
    // printLinkedList(l1);

    // l1.set(1, 99);
    // l1.set(3, 54);
    // printLinkedList(l1);

    
   }   
}
