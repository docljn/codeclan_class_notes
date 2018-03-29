public class Instructor extends Person  {

//    instance variable which is NOT inherited:
    private String moduleTeam;

    public Instructor(String name, String cohort, String moduleTeam) {
        super(name, cohort);
    //    super MUST be called above all the local constructor methods
        this.moduleTeam = moduleTeam;
    }


    public String getModuleTeam() {
        return this.moduleTeam;
    }

    public void setModuleTeam(String moduleTeam) {
        this.moduleTeam = moduleTeam;
    }
}
