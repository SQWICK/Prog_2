package attacks.ph;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Rock_Slide extends PhysicalMove {
    public Rock_Slide() {
        super(Type.ROCK, 75, 90);
    }

    @Override
    protected String describe(){
        return "Использует атаку Rock Slide";
    }
}
