
/*
    The problem with this is that you can instantiate a "computer" when you only want a specific type
    You should never be able to create a non-specific superclass instance

    public class Computer {

        public String runApplication(String appName) {
            return appName + " Status: ";
        }
    }
*/

//  setting a super class to abstract means you cannot create an instance of it

public abstract class Computer {

    public String runApplication(String appName) {
        return appName + " Status: ";
    }

    public abstract String closeApplication(String appName);
    // CARE: You cannot have an abstract method in a non-abstract class

    /*
    An abstract method MUST be implemented by the subclass, but has no method body
    The subclass sets the method implementation
    An abstract method has no curly brackets, and ends with a semicolon only
    If you don't implement the method, the subclass will not compile
     */

    public String shutdown() {
        return "Shutting down";
    }

    /*
    a standard method in the superclass can either be called, or be overridden, by the subclass.
     */


}
