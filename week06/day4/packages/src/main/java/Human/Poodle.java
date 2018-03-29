package Human;

import Animal.Dog;

public class Poodle extends Dog {

    public void beStupid(){
        Dog dog = new Dog;
        System.out.println(dog.age);  // package-private so only accessible to original class and package, NOT subclass
        System.out.println(dog.wagTail());  //protected so SHOULD be accessible to class, package, subclass
    }
}
