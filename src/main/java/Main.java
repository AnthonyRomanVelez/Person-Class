//Main class
public class Main{
    public static void main(String[] args){
        
        Person student = new Student("Richard Smith", "586 Hill Dr San Diego", "619-555-8888", "richardsmith@gmail.com", "Senior");
        System.out.println(student);
        
        Person employee = new Employee("Will Smith", "958 Beverly Hills Los Angeles", "619-528-0008", "willsmith@gmail.com","office", 1000.00 ,new MyDate(9,12,2000));
        System.out.println(employee);
        
        Person faculty = new Faculty ("Sarah Rodgers", "58 Little Creek Portland", "682-635-7777", "sarah21@yahoo.com","office" , 200.35, new MyDate(4, 8, 2017), 8, "front desk");
        System.out.println(faculty);
        
        Person staff = new Staff ("Olivia Hunter", "4865 Moon rd Chula Vista", "619-852-0147", "OHunter@gmail.com", "office", 254.96, new MyDate(8,8,2005), "Supervisor");
        System.out.println(staff);
    }
}
