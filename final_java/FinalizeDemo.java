class Test {
    public void finalize() throws Throwable {
        System.out.println("finalize() called before object is garbage collected");
    }
}

public class FinalizeDemo {
    public static void main(String[] args) {
        Test t = new Test();
        t = null;  // Make object eligible for GC
        System.gc(); 
        System.out.println("Main method ends");
    }
}
