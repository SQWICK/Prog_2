package attacks.sp;
import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove {

    public Flamethrower(){
        super(Type.FIRE, 90, 100);
    }

    @Override
    protected String describe(){
        return "Использует атаку Flamethrower";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setCondition(new Effect().chance(0.1).condition(Status.BURN));
    }
}
