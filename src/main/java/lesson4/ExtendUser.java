package lesson4;

public class ExtendUser extends User {
    private String department;

    public ExtendUser(String firstName, String lastName, Integer age, String department) {
        super(firstName, lastName, age);
        this.department = department;
    }


    public ExtendUser() {
        super();
        this.department = "";
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
