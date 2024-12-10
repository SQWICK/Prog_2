package attacks.sp;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Boomburst extends SpecialMove {

    public Boomburst(){
        super(Type.NORMAL, 140, 100);
    }

    @Override
    protected String describe(){
        return "Использует атаку Boomburst";
    }
}
