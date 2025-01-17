package ExceptionHnadle;

public class User {
    private String username;
    private int age;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        if(username == null || username.isBlank()){
            throw new IllegalArgumentException("your username can not be blank or null");
        }
        this.username = username;
    }

    public int getAge() {
        if(age < 0){
            throw new IllegalArgumentException("Age of the persion can not be negative");
        }
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}
