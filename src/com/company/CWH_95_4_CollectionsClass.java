// import java.util.List;
// import java.util.Objects;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;

// class NewStudent implements Comparable<NewStudent>{
//     String name;
//     int rollNo;
//     NewStudent(String name,int rollNo){
//         this.name=name;
//         this.rollNo=rollNo;
//     } 
//     @Override
//     public String toString() {
//         return "Student{"+"name='"+name+'\''+",rollno="+rollNo+'}';
//     }
//     @Override
//     public boolean equals(Object o){
//        if(this==o){
//         return true;
//        }
//        if(o==null || getClass()!=o.getClass()){
//         return false;
//        }
//        NewStudent NewStudent=(NewStudent)o;
//        return rollNo==NewStudent.rollNo;
//     }
//     @Override
//     public int hashCode(){
//         return Objects.hashCode(rollNo);
//     }
//     @Override
//     public int compareTo(NewStudent that){
//        return this.rollNo-that.rollNo;
//     }
// }
// public class CWH_95_4_CollectionsClass {
//     public static void main(String[] args) {
//         // Example1)
//         // List<Integer> list=new ArrayList<>();
//         // list.add(34);
//         // list.add(76);
//         // list.add(12);
//         // list.add(9);
//         // list.add(76);
//         // list.add(29);
//         // list.add(75);
//         // System.out.println(list);

//         // Collections.min()
//         // System.out.println(Collections.min(list));

//         // Collections.max()
//         // System.out.println(Collections.max(list));

//         // Collections.frequency()
//         // System.out.println(Collections.frequency(list,9));
//         // System.out.println(Collections.frequency(list,76));

//         // Collections.fill()
//         // Collections.fill(list,17);
//         // System.out.println(list);

//         // Collections.sort()
//         // Collections.sort(list);
//         // System.out.println(list);
//         // Collections.sort(list,Comparator.reverseOrder());
//         // System.out.println(list);

//         // Example2) 
//         // List<NewStudent> list=new ArrayList<>(); 
//         // list.add(new NewStudent("Anuj",2));
//         // list.add(new NewStudent("Ramesh",4));
//         // list.add(new NewStudent("Shivam",6));
//         // list.add(new NewStudent("rohit",2));
//         // System.out.println(list);

//         // sort by rollNo 
//         // Collections.sort(list);
//         // System.out.println(list);

//         // sort by name 
//         // Collections.sort(list,new Comparator<NewStudent>(){
//         //     @Override
//         //     public int compare(NewStudent o1, NewStudent o2) {
//         //         return o1.name.compareTo(o2.name);
//         //     }
//         // });
//         // System.out.println(list);


//         // NewStudent s1=new NewStudent("Ramesh",4);
//         // NewStudent s2=new NewStudent("Ramesh",4);
//         // NewStudent s3=new NewStudent("Ramesh",5);
//         // NewStudent s4=new NewStudent("Ramesh",1);
//         // System.out.println(s1.compareTo(s2)); 
//         // System.out.println(s1.compareTo(s3));
//         // System.out.println(s1.compareTo(s4));

//     }
// }
