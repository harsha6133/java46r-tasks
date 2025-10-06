public class CountVowel {
    public static void main(String[] args) {
        String s=new String("Harsha");
        int count=0;
        for(int i=0;i<s.length();i++){
            Character ch=Character.toLowerCase(s.charAt(i));
            if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println("No of vowels : "+count);
    }
    
}
