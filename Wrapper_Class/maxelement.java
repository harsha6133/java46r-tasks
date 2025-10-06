import java.util.ArrayList;
import java.util.Arrays;

public class maxelement {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(2,7,4,90,20));

        int max=al.get(0);

        for(Integer i:al){
            if(i>max){
                max=i;
            }
        }
        System.out.println(max);
        
    }
    
}
