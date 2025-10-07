import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        int k=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=k;
                k++;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
    
}
