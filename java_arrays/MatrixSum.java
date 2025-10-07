import java.util.Arrays;

public class MatrixSum {
    public static void main(String[] args) {
        int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2={{3,2,1},{6,5,4},{9,8,7}};
        int[][] sum=new int[3][3];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(sum));



        

    }
    
}
