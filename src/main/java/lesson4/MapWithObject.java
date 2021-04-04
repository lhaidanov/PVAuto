package lesson4;

import java.util.HashMap;
import java.util.Map;

public class MapWithObject {
    public static void main(String[] args) {
        Animal dog = new Dog("Tuzik", 15);
        Animal cat = new Cat("Murzik", 12);

        Fish carpFish = new Carp("SillentHil", 1);
        carpFish.swim();

        dog.giveSounds();
        cat.giveSounds();


//
//        User user1 = new User("Ivan", "Ivanov", 26);
//        User user2 = new User("Petr", "Petrov", 32);
//        User user3 = new User("Sergey", "Brit", 18);
//        User user4 = new User();
//
//        user4.setLastName("Siderov");
//        user4.setFirstName("Sidor");
//
//        Map<Integer, User> users = new HashMap<>();
//
//        users.put(1234,user1);
//        users.put(456,user2);
//        users.put(789,user3);
//        users.put(258, user4);
//
//        ExtendUser extendUser = new ExtendUser("Artem", "Gordienko", 15, "CS");
//
//
//        System.out.println(users);
    }

}
