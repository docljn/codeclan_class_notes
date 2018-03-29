package wizard_management.people;


import wizard_management.behaviours.IFlyable;
import wizard_management.carpets.MagicCarpet;
import wizard_management.cleaning.Broomstick; // in a different package, so must be imported

public class Wizard {
    private String name;
    private IFlyable ride;

    public Wizard(String name, IFlyable ride){
        this.name = name;
        this.ride = ride;
    }
    
    /*
    the problem with this setup is that the wizard has to select his ride at initialization
    https://sourcemaking.com/design_patterns/strategy - what you want is a way to select that during the program
    i.e. have a setter for the ride, which can change the ride
    OR (my thoughts) overload to change a ride temporarily, but leave the default as the original parameter.
    */


    public String getName(){
        return this.name;
    }


    public String fly(){
        return this.ride.fly();
    }

    public IFlyable getRide() {
        return this.ride;
    }

    public void setRide(IFlyable ride) {
        this.ride = ride;
    }
}

/*
https://stackoverflow.com/questions/885937/what-is-the-difference-between-association-aggregation-and-composition
http://opensourceforgeeks.blogspot.co.uk/2014/11/difference-between-association.html

AGGREGATION vs. COMPOSITION vs. DEPENDENCY

Aggregation implies a relationship where the child can exist independently of the parent. Example: Class (parent) and Student (child). Delete the Class and the Students still exist.

Composition implies a relationship where the child cannot exist independent of the parent. Example: House (parent) and Room (child). Rooms don't exist separate to a House.

The above two are forms of containment (hence the parent-child relationships).


Dependency is a weaker form of relationship and in code terms indicates that a class uses another by parameter or return type.
Dependency is a form of association.

 */

/*
ALTERNATIVE:


     Association is a relationship where all objects have their own lifecycle and there is no owner.

    Let's take an example of Teacher and Student. Multiple students can associate with single teacher and single student can associate with multiple teachers, but there is no ownership between the objects and both have their own lifecycle. Both can be created and deleted independently.

    * Aggregation is a specialised form of Association where all objects have their own lifecycle, but there is ownership and child objects can not belong to another parent object.

    Let's take an example of Department and teacher. A single teacher can not belong to multiple departments, but if we delete the department, the teacher object will not be destroyed. We can think about it as a “has-a” relationship.

    Composition is again specialised form of Aggregation and we can call this as a “death” relationship. It is a strong type of Aggregation. Child object does not have its lifecycle and if parent object is deleted, all child objects will also be deleted.

    Let's take again an example of relationship between House and Rooms. House can contain multiple rooms - there is no independent life of room and any room can not belong to two different houses. If we delete the house - room will automatically be deleted.

    Let's take another example relationship between Questions and Options. Single questions can have multiple options and option can not belong to multiple questions. If we delete the questions, options will automatically be deleted.


 */
