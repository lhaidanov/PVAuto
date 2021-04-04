package lesson4;

public abstract class Animal {
    protected String name;
    protected Integer age;

    public Animal() {
    }

    public abstract void goForAWalk();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void giveSounds() {
        System.out.println("Sound!");


    }

    ;
}
