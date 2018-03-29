public class DesktopComputer extends Computer{
    public String runApplication(String appName) {
       return super.runApplication(appName) + "I am running " + appName;
        // works because superclass runApplication returns a public String, thus can add another string
    }

    public String closeApplication(String appName) {
        return "Closing down " + appName;
    }
}
