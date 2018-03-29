public class Printer implements IConnect {
    public String print(String data) {
        return "printing: " +  data;
    }

    public String connect(String networkName) {
        return "Printer connecting to network: " + networkName;
    }
}
