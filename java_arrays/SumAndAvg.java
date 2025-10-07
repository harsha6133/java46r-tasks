public class SumAndAvg {
    public static void main(String[] args) {
        int[] arr={2,5,1,6,8,3,9};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        System.out.println("Sum : "+sum);
        System.out.println("Average : "+(sum/arr.length));
    }

}
