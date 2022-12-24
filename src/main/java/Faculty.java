//Faculty class will extend from the Employee class
public class Faculty extends Employee{
    private double hours;
    private String rank;
    
    public Faculty(String name, String address, String phoneNumber, String email, String office, 
                   double salary, MyDate datehired, double officeHours, String rank) {
            super(name, address, phoneNumber, email, office, salary, datehired);
            this.hours = hours;
            this.rank = rank;
}
    public void setHours(double hours){
        this.hours = hours;
    }
    public void setRank(String rank){
        this.rank = rank;
    }
    public double getHours(){
        return hours;
    }
    public String getRank(){
        return rank;
    }
    @Override
    public String toString(){
    return super.toString() + " Office Hours " + hours;
    }
}
