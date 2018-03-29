import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;
    private int slotCount;
    /*
    if a class implements an interface, it takes on the type IInterfaceName, which means you don't need to have two separate arraylists: one for Printer, one for Desktop, nor two connect methods.
    This also avoids the problem with inheritance, where if you set an arraylist to the superclass, you no longer have access to the methods of the subclass.
    CARE: if a method definitely requires a specific class, use the class type, not the interface type
    */

    public Network(String name, int slotCount){
        this.devices = new ArrayList<>();
        this.name = name;
        this.slotCount = slotCount;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public int getSlotCount() {
        return this.slotCount;
    }

    public void connect(IConnect device){
        if (getFreeSlotCount() > 0) {
            devices.add(device);
        }
    }


    public void disconnectAll(){
        devices.clear();
    }


    public int getFreeSlotCount() {
        return getSlotCount() - deviceCount();
    }
}