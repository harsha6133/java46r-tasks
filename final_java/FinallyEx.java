public class FinallyEx {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        try{
            System.out.println(arr[3]);
        }
        /* catch(ArrayIndexOutOfBoundsException ae){
            System.out.println(ae.getMessage());
        } */
        finally{ // Finally block Always Executes Even though Exception is caught or not
            System.out.println("Finally Always Executes"); // Always executes (only if jvm stops it doesnt execute)
        }
        System.out.println("End of the program");
    }
    
}
