public class sumofprimes {
    public static void main(String[] args) {
        int num=1234;
        int sum=0;
        
        while(num!=0){
            int rem=num%10;
            int count=0;
            for(int i=1;i<=rem;i++){
                if(rem%i==0)
                    count++;
            }
            if(count==2){
                    sum=sum+rem;
            }
            num=num/10;
        }
        System.out.println(sum);

    }
    
}
