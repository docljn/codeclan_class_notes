public class Desktop implements IConnect {
    private String name;
    private String make;
    private String model;

    public Desktop(String name, String make, String model) {
        this.name = name;
        this.make = make;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String connect(String networkName) {
        return "Desktop connecting to network: " + networkName;
    }
}
