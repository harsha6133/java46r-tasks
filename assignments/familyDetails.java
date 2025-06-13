public class familyDetails {
    static String Surname = "Lakkoju";//static variable 
    String name;//instance variable
    int age;//instacnce variable

    public static void main(String[] args) {
        familyDetails obj = new familyDetails();//obj - object reference
        familyDetails obj1 = new familyDetails();
        obj.name = "Harsha";
        obj.age = 20;
        obj1.name = "Rudra";
        obj1.age = 22;
        System.out.println("Family member 1 Details");
        System.out.println("Surname : " + familyDetails.Surname + " Name : " + obj.name + " Age : " + obj.age);
        System.out.println("Family member 2 Details");
        System.out.println("Surname : " + familyDetails.Surname + " Name : " + obj1.name + " Age : " + obj1.age);
    }
}