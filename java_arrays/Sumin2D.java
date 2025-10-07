import java.util.Arrays;

public class Sumin2D {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        int k=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=k;
                k++;
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);

        
    }
    
}
