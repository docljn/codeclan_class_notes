package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String ni, double salary, String deptName) {
        super(name, ni, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }
}
