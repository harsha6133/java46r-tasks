public class collegeDetails {
    static String collegeName="Swarnandhra college";
    String name;
    int rollno;
    collegeDetails(int idno){
        rollno=idno;
    } 
    public void showDetails(){
        System.out.println("College : "+collegeDetails.collegeName+" Name : "+name+" Roll Number : "+rollno);
    }
    public static void main(String[] args) {
        collegeDetails obj=new collegeDetails(101);
        collegeDetails obj1=new collegeDetails(102);

        obj.name="Anil";
        obj1.name="Vamsi";

        obj.showDetails();
        obj1.showDetails();

        collegeDetails.collegeName="KLU";
        obj1.name="Karthik";
        obj.showDetails();
        obj1.showDetails();   
    }
}
