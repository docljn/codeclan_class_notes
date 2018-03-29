package Human;

import Animal.Dog;

public class SkinHead extends Dog { //subclass of dog, but in separate package  WTF

    public void teach(Dog dog) {

        Dog puppy = new Dog();

        dog.name = "Pet";
        dog.bark();     // public Dog method
        puppy.wagTail();  // protected Dog method: not accessible
        puppy.age();      // package-private Dog method: not accessible
    }
}
