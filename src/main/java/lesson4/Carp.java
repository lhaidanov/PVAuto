package lesson4;

public class Carp extends Animal implements Fish {

    public Carp(String name, Integer age) {
        super();
    }

    @Override
    public void goForAWalk() {
        System.out.println("Can Not!");


    }

    @Override
    public void swim() {
        System.out.println("can swim");

    }
}
