import java.util.ArrayList;

public class PrimitiveVsWrapperDemo {
    public static void main(String[] args) {
        
        // Not allowed - Collections can't store primitive types
        // ArrayList<int> primitiveList = new ArrayList<>(); // Compile error

        // Allowed - Must use Wrapper classes instead
        ArrayList<Integer> wrapperList = new ArrayList<>();

        wrapperList.add(10);// int->Integer auto boxing
        wrapperList.add(20);
        wrapperList.add(30);

        System.out.println("Wrapper List: " + wrapperList);

        int sum = 0;
        for (int num : wrapperList) {  // Integer -> int auto unboxing
            sum += num;
        }

        System.out.println("Sum of elements: " + sum);
    }
}
