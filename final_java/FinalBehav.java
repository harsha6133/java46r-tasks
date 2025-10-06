public class FinalBehav {
    final static double PI=3.145;
    public static void main(String[] args) {
        final int a=10;

        // a=20; Will give error because final variable cannot be reassigned
        System.out.println(a);

        System.out.println("PI value "+PI);

        final StringBuffer sb=new StringBuffer("Harsha");
        sb.append("vardhan");//Can be modified

        //sb=new StringBuffer("Harshavardhan"); Cannot be reassigned

        System.out.println(sb);
        
    }
    
}
