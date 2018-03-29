public class Student extends Person {
//    private String name;
//    private String cohort;
        // can get rid of these instance variables
        // IF we set the variables in the superclass to be protected(visible to class and subclass)
        // instead of private(visible inside class only)
        // NOT public as this makes it visible to anything at all...

    public Student(String name, String cohort) {
        super(name, cohort); //calls the constructor from the class one step up, i.e. the superclass...
                             //we can thus delete every method except the constructor from the class!
                             // c.f. Instructor class for deleted rather than commented out.
//        this.name = name;
//        this.cohort = cohort;
    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getCohort() {
//        return cohort;
//    }
//
//    public void setCohort(String cohort) {
//        this.cohort = cohort;
//    }
//

    // over-ride the talk method in Person (NOT overloading)
    // the argument names do not have to match the super method
    public String talk(String study_language){
        return "I love learning " + study_language;
    }
}
