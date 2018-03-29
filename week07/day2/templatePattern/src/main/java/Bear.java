public abstract class Bear {

    /*
      the typicalDay() method is a *template* for a particular set of actions,
      defining the required steps
      The Template Pattern can be very messy, and very restrictive, as you have to override methods
      in order to create your desired behaviour
      Strategy Pattern is easier/more flexible to implement.
     */

    public void typicalDay(){
        wakeUp();
        gatherFood();
        eat();
        sleep();
    }

    public void wakeUp(){
        System.out.println("Waking up");
    }

    public void eat(){
        System.out.println("Eating");
    }

    public void sleep(){
        System.out.println("Going to sleep \n");
    }

    public abstract void gatherFood();

}
