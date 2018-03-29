import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetworkTest {

    Network network;
    Desktop desktop;
    Printer printer;
    InternetRadio radio;

    @Before
    public void before() {
        network = new Network("CodeClan", 2);
        desktop = new Desktop("Keith's Desktop", "Apple", "Macbook Pro");
        printer = new Printer();
        radio = new InternetRadio();
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan", network.getName());
    }

    @Test
    public void deviceListStartsEmpty() {
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void canConnectDesktop() {
        network.connect(desktop);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void shouldEmptyDeviceListAfterDisconnectingAll() {
        network.connect(desktop);
        network.disconnectAll();
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void canConnectPrinter(){
        network.connect(printer);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void canConnectInternetRadio(){
        network.connect(radio);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void canGetSlotCount(){
        assertEquals(2, network.getSlotCount());
    }

    @Test
    public void canCountFreeSlots(){
        network.connect(radio);
        assertEquals(1, network.getFreeSlotCount());
    }

    @Test
    public void connectionRequiresEmptySlot(){
        network.connect(radio);
        network.connect(radio);
        network.connect(radio);
        assertEquals(2, network.deviceCount());

    }
}
