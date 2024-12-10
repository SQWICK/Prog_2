package pokemon;
import attacks.ph.Rock_Slide;
import attacks.sp.Boomburst;
import attacks.sp.Flamethrower;
import attacks.st.Double_Team;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Flygon extends Pokemon {

    public Flygon(String name, int level){
        super(name, level);
        this.setType(Type.GROUND, Type.DRAGON);
        this.setStats(80,100,80,80,80,100);
        this.setMove(new Rock_Slide(), new Boomburst(), new Double_Team(), new Flamethrower());
    }
}
