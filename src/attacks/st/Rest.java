package attacks.st;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    public Rest(){
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected String describe(){
        return "Исользует Rest";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setCondition(new Effect().condition(Status.SLEEP).turns(2));
    }
}
