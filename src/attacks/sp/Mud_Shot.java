package attacks.sp;
import ru.ifmo.se.pokemon.*;

public class Mud_Shot extends SpecialMove {
    public Mud_Shot(){
        super(Type.GROUND,55,95);
    }

    @Override
    protected String describe(){
        return "Использует атаку Mud Shot";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect eff = new Effect();
        eff.stat(Stat.SPEED, (int) p.getStat(Stat.SPEED) - 1);
        p.addEffect(eff);
    }
}
