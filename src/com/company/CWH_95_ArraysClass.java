import java.util.Arrays;

public class CWH_95_ArraysClass {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,8,9,10};
        int index=Arrays.binarySearch(numbers,5);
        System.out.println(index);
    }
}
