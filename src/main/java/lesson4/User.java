package lesson4;

public class User {
    public static final String CLASS_NAME = "User";
    private String firstName;
    private String lastName;
    private Integer age;
    private String lastNameWithFirstName;


    public User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        setLastNameWithFirstName();
    }

    public User() {
        this("", "", 18);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        setLastNameWithFirstName();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        setLastNameWithFirstName();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLastNameWithFirstName() {
        return lastNameWithFirstName;
    }

    private void setLastNameWithFirstName() {
        this.lastNameWithFirstName = lastName + "" + firstName;
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }


}
