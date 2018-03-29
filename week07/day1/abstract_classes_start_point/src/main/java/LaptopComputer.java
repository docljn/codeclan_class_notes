public class LaptopComputer extends Computer {

    public String RunApplication(String appName) {
        return super.runApplication(appName) + "Program " + appName + " is running";
    }

    public String closeApplication(String appName) {
        return "Program " + appName + " is closing down";
    }

    /*
      You could just use over-ride on the method of a standard class,
      but the abstract class _requires_ the method in the subclass
    */
}
