package StaticSection;

public class User {

    private String firstName;
    private String lastName;
    private static int count=0;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        User.count++;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static int getCount(){
        return count;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}