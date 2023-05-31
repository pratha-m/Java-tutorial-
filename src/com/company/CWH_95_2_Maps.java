// import java.util.HashMap;
// import java.util.Map;
// import java.util.TreeMap;

// public class CWH_95_2_Maps {
//     public static void main(String[] args) {
//         // ****HashMap-->stores key value pairs and keys must be unique (if added same key
//         //  again then their values will be overwrite) all operation in O(1) time *****
//         // Map<String,Integer> numbers=new HashMap<>(); 
//         // numbers.put("One",1);
//         // numbers.put("Seven", 10);
//         // numbers.put("Two",2);
//         // numbers.put("Three",3);
//         // numbers.put("Two",8);
//         // System.out.println(numbers);

//         // isEmpty()
//         // System.out.println(numbers.isEmpty());

//         // clear()
//         // numbers.clear();
//         // System.out.println(numbers);
//         // System.out.println(numbers.isEmpty());

//         // containsKey()  
//         // System.out.println(numbers.containsKey("Two"));
//         // System.out.println(numbers.containsKey("Four"));

//         // remove()
//         // numbers.remove("Three");
//         // System.out.println(numbers);

//         // replace()
//         // numbers.replace("Three",73);
//         // System.out.println(numbers);

//         // containsValue()
//         // System.out.println(numbers.containsValue(3));
//         // System.out.println(numbers.containsValue(8));
//         // System.out.println(numbers.containsValue(15));

//         // putIfAbsent()-->Puts the key value pair if key is not already present
//         // numbers.putIfAbsent("Three",6);
//         // System.out.println(numbers);
//         // numbers.putIfAbsent("Four",8);
//         // System.out.println(numbers);

//         // get()
//         // System.out.println(numbers.get("Three"));

//         // entrySet()
//         // System.out.println(numbers.entrySet());

//         // keySet()
//         // System.out.println(numbers.keySet()); 

//         // valueSet()
//         // System.out.println(numbers.values());

//         // Iterating  
//         // Method1)
//         // for(Map.Entry<String,Integer> e:numbers.entrySet()){
//         //     System.out.println("Key Value Pair :"+e);
//         //     System.out.println("Key :"+e.getKey());
//         //     System.out.println("Value :"+e.getValue());
//         //     System.out.println();
//         // }

//         // Iterating Keys 
//         // for(String key:numbers.keySet()){
//         //     System.out.println(key);
//         // }

//         // Iterating values
//         // for(Integer value:numbers.values()){
//         //     System.out.println(value);
//         // }
        
//         // *****TreeMap-->stores key value pairs and keys must be unique the keys
//         //  are arranged in the ascending order of strings sorting order
//         // (if added same key again then their values will be overwrite)
//         //  all operation in O(logn) time ******
//         // Map<String,Integer> numbers=new TreeMap<>(); 
//         // numbers.put("One",1);
//         // numbers.put("Two", 2);
//         // numbers.put("Three",3);
//         // numbers.put("Four",4);
//         // numbers.put("Five",5);
//         // System.out.println(numbers);

//         // isEmpty()
//         // System.out.println(numbers.isEmpty());

//         // clear()
//         // numbers.clear();
//         // System.out.println(numbers);
//         // System.out.println(numbers.isEmpty());

//         // containsKey()  
//         // System.out.println(numbers.containsKey("Two"));
//         // System.out.println(numbers.containsKey("Four"));

//         // remove()
//         // numbers.remove("Three");
//         // System.out.println(numbers);

//         // replace()
//         // numbers.replace("Three",73);
//         // System.out.println(numbers);

//         // containsValue()
//         // System.out.println(numbers.containsValue(3));
//         // System.out.println(numbers.containsValue(8));
//         // System.out.println(numbers.containsValue(15));

//         // putIfAbsent()-->Puts the key value pair if key is not already present
//         // numbers.putIfAbsent("Three",6);
//         // System.out.println(numbers);
//         // numbers.putIfAbsent("Six",8);
//         // System.out.println(numbers);

//         // get()
//         // System.out.println(numbers.get("Three"));

//         // entrySet()
//         // System.out.println(numbers.entrySet());

//         // keySet()
//         // System.out.println(numbers.keySet()); 

//         // valueSet()
//         // System.out.println(numbers.values());

//         // Iterating  
//         // Method1)
//         // for(Map.Entry<String,Integer> e:numbers.entrySet()){
//         //     System.out.println("Key Value Pair :"+e);
//         //     System.out.println("Key :"+e.getKey());
//         //     System.out.println("Value :"+e.getValue());
//         //     System.out.println();
//         // }

//         // Iterating Keys 
//         // for(String key:numbers.keySet()){
//         //     System.out.println(key);
//         // }

//         // Iterating values
//         // for(Integer value:numbers.values()){
//         //     System.out.println(value);
//         // }
//     }
// }
