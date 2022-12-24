
//Subclass of Person
public class Student extends Person{
    private String status;
    //constructor
    public Student(String name, String address, 
                   String phoneNumber, String email, 
                   String status){
        super(name, address, phoneNumber, email);
        this.status = status;
    }
    public String toString(){
    return super.toString() + " Student " + this.status;
    }

}
