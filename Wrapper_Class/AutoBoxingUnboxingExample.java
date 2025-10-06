import java.util.ArrayList;

public class AutoBoxingUnboxingExample {
    public static void main(String[] args) {
        
        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(10);  // int -> Integer
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);

        System.out.println("ArrayList (Wrapper objects): " + numberList);

        int firstValue = numberList.get(0);  // Integer -> int
        int secondValue = numberList.get(1);
        int thirdValue = numberList.get(2);

        System.out.println("Retrieved primitive values:");
        System.out.println(firstValue);
        System.out.println(secondValue);
        System.out.println(thirdValue);
    }
}
