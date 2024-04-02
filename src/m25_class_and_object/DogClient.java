package m25_class_and_object;

public class DogClient {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Debbie";
        dog1.age = 2;
        dog1.breed = "Husky";
        dog1.color = "Brown";

        System.out.println("Name: " + dog1.name);
        System.out.println("Age: " + dog1.age);
        System.out.println("Breed: " + dog1.breed);
        System.out.println("Color: " + dog1.color);
        System.out.println();
        dog1.eat();
        dog1.bark();
        dog1.sleep();

        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        System.out.println("-----------------------------------");

        System.out.println(dog1);

    }
}
