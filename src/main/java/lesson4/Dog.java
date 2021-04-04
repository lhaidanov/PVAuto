package lesson4;

public class Dog extends Animal {

    public Dog(String name, Integer age) {
        super.age = age;
        super.name = name;
    }

    @Override
    public void giveSounds() {
        System.out.println("Woof!!");
    }

    @Override
    public void goForAWalk() {
        System.out.println("Dog should go for a walk!");
    }
}
