//Superclass
public abstract class Person {
    protected String name, address, phoneNumber, email;
    //constructor
    public Person(String name, String address, String phoneNumber, String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }//set and get methods
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhone(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }
//toString method to call it in the main function
    @Override
    public String toString(){
        return "Person name " + name + ", Address " + address;
    }
}
