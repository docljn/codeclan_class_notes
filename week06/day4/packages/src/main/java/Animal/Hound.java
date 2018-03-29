package Animal;

import Animal.Dog;

public class Hound extends Dog {

    public void play(){
        Dog dog = new Dog();
        System.out.println(dog.age); // accessible because subclass and in same package
        wagTail();  // protected in Dog class, and accessible in this one: because it is a subclass of Dog
                    // CHECK: do you need to call super or not, and why/why not
    }
}
