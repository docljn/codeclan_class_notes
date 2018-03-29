public class CastMember {
    
    private String name;
    private int healthPoints;
    
    public CastMember(String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
    }


    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String speakName() {
        return "I am " + this.name;
    }

    public void adjustHealthPoints(int amount) {
        this.healthPoints = this.healthPoints - amount;
        if(this.healthPoints < 0){
            this.healthPoints = 0;
        }
    }
}
