package ridezum;


import org.openqa.selenium.WebDriver;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public User(String firstName, String lastName, String email, String phone){

        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.phone=phone;

    }
    public String getFistName(){

        return firstName;
    }
    public String getLastName(){

        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone;
    }






}
