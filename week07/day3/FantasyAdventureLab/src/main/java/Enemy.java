public class Enemy extends CastMember implements IAttack {

    private int attackPoints;

    public Enemy(String name, int healthPoints, int attackPoints) {
        super(name, healthPoints);
        this.attackPoints = attackPoints;
    }

    public void attack(CastMember victim) {
        victim.adjustHealthPoints(this.attackPoints);
    }

    public int getAttackPoints() {
        return this.attackPoints;
    }
}
