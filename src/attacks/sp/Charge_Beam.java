package attacks.sp;
import ru.ifmo.se.pokemon.*;

public class Charge_Beam extends SpecialMove {

    public Charge_Beam(){
        super(Type.ELECTRIC, 50,90);
    }

    @Override
    protected String describe(){
        return "Использует атаку Charge Beam";
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect eff = new Effect();
        eff.chance(0.7).stat(Stat.SPECIAL_ATTACK, (int) p.getStat(Stat.SPECIAL_ATTACK) + 1);
        p.addEffect(eff);
    }
}
