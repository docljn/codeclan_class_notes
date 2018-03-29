public class Guest {

    String name;
    Boolean dataPermission;

    public Guest(String name, boolean dataPermission) {
//        eventually will want a guest id rather than just a name....
        this.name = name;
        this.dataPermission = dataPermission;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getDataPermission() {
        return this.dataPermission;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDataPermission(boolean dataPermission) {
        this.dataPermission = dataPermission;
    }
}
