import java.util.Scanner;
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int reverse=0;
        while(n!=0){
            int rem=n%10;
            reverse=reverse*10+rem;
            n=n/10;
        }
        if(temp==reverse){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not");
        }
    }
    
}
