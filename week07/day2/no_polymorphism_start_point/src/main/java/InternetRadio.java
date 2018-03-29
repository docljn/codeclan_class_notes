public class InternetRadio implements IConnect{

    public String connect(String networkName) {
        return "InternetRadio connecting to network: " + networkName;
    }


    public String tuneTo(String stationName) {
        return "Tuning to " + stationName;
    }
}
