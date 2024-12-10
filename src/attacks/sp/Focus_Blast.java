package attacks.sp;
import ru.ifmo.se.pokemon.*;

public class Focus_Blast extends SpecialMove {
    public Focus_Blast(){
        super(Type.FIGHTING,120,70);
    }

    @Override
    protected String describe(){
        return "Использует атаку Focus Blast";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect eff = new Effect();
        eff.chance(0.1).stat(Stat.SPECIAL_DEFENSE, (int) p.getStat(Stat.SPECIAL_DEFENSE) - 1);
        p.addEffect(eff);
    }
}
