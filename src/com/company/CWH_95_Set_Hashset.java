// import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.Objects;
// import java.util.Set;
// import java.util.TreeSet;

// class Student{
//     String name;
//     int rollNo;
//     Student(String name,int rollNo){
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
//        Student student=(Student)o;
//        return rollNo==student.rollNo;
//     }
//     @Override
//     public int hashCode(){
//         return Objects.hashCode(rollNo);
//     }
// }
// public class CWH_95_Set_Hashset {
//     public static void main(String[] args) {
//         // ***Hashset*** 
//         // HashSet<Integer> h1=new HashSet<>();
//         // h1.add(6);
//         // h1.add(8);
//         // h1.add(3);
//         // h1.add(11);
//         // h1.add(11);
//         // System.out.println(h1);

//         // h1.clear();
//         // System.out.println(h1);

//         // System.out.println(h1.contains(6));
//         // System.out.println(h1.contains(12));

//         // System.out.println(h1.clone());

//         // System.out.println(h1.toArray());
//         // System.out.println(h1.toArray()[0]);
//         // System.out.println(h1.toArray()[1]);
//         // System.out.println(h1.toArray()[2]);

//         // h1.remove(8);
//         // System.out.println(h1); 

//         // System.out.println(h1.size());


//         // ****HashSet using Set (in hashset elements are in random order) all operations done in O(1) time***
//         // Set<Integer> set=new HashSet<>();
//         // set.add(12);
//         // set.add(13);
//         // set.add(14);
//         // set.add(15);
//         // set.add(16);
//         // set.add(15);
//         // System.out.println(set);

//         // size()
//         // System.out.println(set.size());

//         // remove() function 
//         // set.remove(12);
//         // set.remove(15);
//         // System.out.println(set);

//         // contains() function 
//         // System.out.println(set.contains(15));
//         // System.out.println(set.contains(9));

//         // isEmpty() function 
//         // System.out.println(set.isEmpty());

//         // clear()
//         // set.clear();
//         // System.out.println(set);

//         // ***LinkedHashSet Using Set (in linkedHashSet the elements are in the order in which they added)*** 
//         // Set<Integer> set=new LinkedHashSet<>();
//         // set.add(12);
//         // set.add(13);
//         // set.add(14);
//         // set.add(15);
//         // set.add(16);
//         // set.add(15);
//         // System.out.println(set);

//         // size()
//         // System.out.println(set.size());

//         // remove() function 
//         // set.remove(12);
//         // set.remove(15);
//         // System.out.println(set);

//         // contains() function 
//         // System.out.println(set.contains(15));
//         // System.out.println(set.contains(9));

//         // isEmpty() function 
//         // System.out.println(set.isEmpty());

//         // clear()
//         // set.clear();
//         // System.out.println(set); 

//         // ***TreeSet Using Set (in TreeSet the elements are arranged in the sorted order) 
//         // all operations done in O(logn) time *** 
//         // Set<Integer> set=new TreeSet<>();
//         // set.add(15);
//         // set.add(13);
//         // set.add(12);
//         // set.add(119);
//         // set.add(11);
//         // set.add(5);
//         // System.out.println(set);

//         // size()
//         // System.out.println(set.size());

//         // remove() function 
//         // set.remove(12);
//         // set.remove(15);
//         // System.out.println(set);

//         // contains() function 
//         // System.out.println(set.contains(15));
//         // System.out.println(set.contains(9));

//         // isEmpty() function 
//         // System.out.println(set.isEmpty());

//         // clear()
//         // set.clear();
//         // System.out.println(set); 

//         // Example1)
//         Set<Student> studentSet=new HashSet<>(); 
//         studentSet.add(new Student("Anuj",2));
//         studentSet.add(new Student("Ramesh",4));
//         studentSet.add(new Student("Shivam",6));
//         studentSet.add(new Student("rohit",2));
//         System.out.println(studentSet);

//         // Student s1=new Student("Ramesh",12);
//         // Student s2=new Student("gamer",17);
//         // Student s3=new Student("hello",12);
//         // System.out.println(s1.equals(s2));
//         // System.out.println(s1.equals(s3));
//     }   
// }
