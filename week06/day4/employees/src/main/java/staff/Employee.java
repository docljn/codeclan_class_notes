package staff;

public class Employee {

    private String name;
    private String ni;
    private double salary;

    public Employee(String name, String ni, double salary) {
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNi() {
        return this.ni;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double raise) {
        this.salary += raise;
    }

    public double getBonus(){
        return this.salary * 0.01;
    }

    public void setName(String name) {
//        if (name == null) return;
        this.name = name;
    }

    public void setNi(String ni) {
        this.ni = ni;
    }
}
