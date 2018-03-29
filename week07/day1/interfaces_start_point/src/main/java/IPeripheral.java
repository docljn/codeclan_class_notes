/*
NAMING:
Older convention: IPeripheral
Newer convention: Peripherable
 */

public interface IPeripheral {

    // specify a method, not an implementation
    // can be type return or void
    // called a CONTRACT
    String connect();
}
