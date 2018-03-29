package Human;

import Animal.Dog;
//because dog is in a separate package: Animal
//it isn't accessible in the Human package, even though it's in the same project
//you need this in order to be able to access an instance of the class
//  can instantiate, can call public method, canNOT call protected/private methods

public class Trainer {
    public void teach(Dog dog) {
        dog.name = "Pet";
        dog.bark();
        // dog.wagTail(); not accessible because the method is protected in package Animal
        Poodle poodle = new Poodle();
        poodle.wagTail();
    }

}
