package Animal;

public class Cat {

    public void playsWith(Dog dog){  //no need to import Dog class: we are in the same package
        dog.wagTail();               //we can access the protected Dog method: we are in the same package
    }

}
