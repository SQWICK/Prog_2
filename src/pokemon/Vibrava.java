package pokemon;
import attacks.ph.Rock_Slide;
import attacks.sp.Boomburst;
import attacks.st.Double_Team;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vibrava extends Pokemon {

    public Vibrava(String name, int level){
        super(name, level);
        this.setType(Type.GROUND, Type.DRAGON);
        this.setStats(50, 70, 50, 50, 50,70);
        this.setMove(new Double_Team(), new Rock_Slide(), new Boomburst());
    }
}
