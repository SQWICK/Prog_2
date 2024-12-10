package attacks.st;
import ru.ifmo.se.pokemon.*;

public class Double_Team extends StatusMove {
    public Double_Team(){
        super(Type.NORMAL,0,0);
    }

    @Override
    protected String describe(){
        return "Исользует Double Team";
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect eff = new Effect();
        eff.stat(Stat.DEFENSE, (int) p.getStat(Stat.DEFENSE) + 1);
        p.addEffect(eff);
    }
}
