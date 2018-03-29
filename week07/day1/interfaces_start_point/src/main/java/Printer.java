public class Printer implements IPeripheral, IPrint {

    public String connect() {
        return "connected";
    }

    public String print(String data) {
        return "Printing " + data;
    }
}
