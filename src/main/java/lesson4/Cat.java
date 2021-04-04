package lesson4;

public class Cat extends Animal {

    public Cat(String name, Integer age) {
        super.age = age;
        super.name = name;
    }

    @Override
    public void giveSounds() {
        System.out.println("Meow!!");
    }

    @Override
    public void goForAWalk() {
        System.out.println("Cat should go for a walk!");
    }
}
