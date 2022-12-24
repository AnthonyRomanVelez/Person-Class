//Staff class extends from Employee class
public class Staff extends Employee{
    private String title;

public Staff(String name, String address, String phoneNumber, String email, String office, 
             double salary, MyDate datehired, String title) {

        super(name, address, phoneNumber, email, office, salary, datehired);
        this.title = title;
}
public void setTitle(){
    this.title = title;
}
public String getTitle(){
    return title;
}
 @Override
    public String toString(){
    return super.toString() + " Title " + title;
    }
}
