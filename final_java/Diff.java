public class Diff {
    public void finalize() throws Throwable{
        System.out.println("Finalize() method called");
    }
    public static void main(String[] args) {
        String s=null;
        try{
            System.out.println(s.length());

        }
        catch(NullPointerException npe){
            System.out.println(npe);
        }
        finally{
            System.out.println("Finally Executed");
        }

        Diff d=new Diff();
        d=null;

        System.gc();
    }
    
}
