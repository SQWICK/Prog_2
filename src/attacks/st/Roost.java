package attacks.st;
import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove {

    public Roost(){
        super(Type.FLYING, 0, 0);
    }

    @Override
    protected String describe(){
        return "Использует Roost";
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect eff = new Effect();
        eff.stat(Stat.HP, (int) ((float) p.getStat(Stat.HP) * 1.5));
        p.addEffect(eff);
    }
}
