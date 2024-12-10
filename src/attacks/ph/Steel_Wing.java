package attacks.ph;
import ru.ifmo.se.pokemon.*;

public class Steel_Wing extends PhysicalMove {

    public Steel_Wing(){
        super(Type.STEEL, 70,90);
    }

    @Override
    protected String describe(){
        return "Использует атаку Steel Wing";
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect eff = new Effect();
        eff.stat(Stat.DEFENSE, (int) p.getStat(Stat.DEFENSE) + 1);
        p.addEffect(eff);
    }
}
