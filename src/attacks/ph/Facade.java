package attacks.ph;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {

    private String add;

    public Facade() {
        super(Type.NORMAL, 70, 100);
        this.add = "";
    }

    protected void applyOppDamage(Pokemon target, double damage) {
        if (isStatusEffected(target)) {
            damage *= 2;
            add = ", С двойным уроном";
        }
        super.applyOppDamage(target, damage);
    }

    private boolean isStatusEffected(Pokemon p) {
        Status status = p.getCondition();
        return status.equals(Status.BURN) || status.equals(Status.POISON) || status.equals(Status.PARALYZE);
    }

    @Override
    protected String describe() {
        return "Использует атаку Facade" + add;
    }
}