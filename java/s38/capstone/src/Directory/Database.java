package Directory;

public class Database {
    private String firstName;
    private String lastName;
    private String contactNumber;
    private String address;

    public Database(){}

    public Database(String firstName, String lastName, String contactNumber, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    // getters and setters
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    // end of getters and setters

    public boolean contains(String searchTerm) {
        searchTerm = searchTerm.toLowerCase();
        return firstName.toLowerCase().contains(searchTerm) || lastName.toLowerCase().contains(searchTerm) || contactNumber.toLowerCase().contains(searchTerm) || address.toLowerCase().contains(searchTerm);
    }

}
