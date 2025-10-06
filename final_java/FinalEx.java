final class finalexample{ //Final class cannot have any subclasses
    public final void m1(){
        final int a=10;
        // a=20; final variable cannot be reassigned
        System.out.println("Final Method");
    }
} 

/* class child extends finalexample{
    cannot Extend Final class

} */

class parent{
    public final void m2(){ // Final method cannot be overridden
        System.out.println("parent m2");
    }

}
class child extends parent{
    public void m2(){
        System.out.println("child"); 
    }
}

public class FinalEx {
    public static void main(String[] args) {

        finalexample f=new finalexample();
        
    }
    
}
