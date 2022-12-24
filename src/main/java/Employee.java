//Employee class is a subclass of Person class
class MyDate{
    private int day, month, year;
    public MyDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
}
public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;
    
    public Employee(String name, String address, String phoneNumber, 
                    String email, String office, double salary, MyDate datehired){
        
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    @Override
    public String toString() {
    return super.toString() + " Office " + office + ", Salary" + salary + " Date Hired " + dateHired;
}
    
}
