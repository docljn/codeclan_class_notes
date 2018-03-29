public class Bear {

//    instance variable defaults to public
//    set to private to avoid bear.name = "whatever"
//    only methods within the bear class can access the instance variable
//    known as Encapsulation (one of 4 pillars of OOP)
    private String name;
    private int age;
    private double weight;
    private char gender;

    //    constructor
    public Bear(String name, int age, double weight, char gender){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

//    rule of thumb: methods should be public

//    getter method - returns a string type
    public String getName(){
        return this.name;
//        specifying this.name shows instance variable returned
    }

//    setter method
    public void setName(String newName){
        this.name = newName;
    }

//    getter method
    public int getAge() {
        return this.age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean readyToHibernate() {
        return this.weight > 80.00;
    }
}
