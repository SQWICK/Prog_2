package pokemon;
import attacks.ph.Rock_Slide;
import attacks.st.Double_Team;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Trapinch extends Pokemon {

    public Trapinch(String name, int level){
        super(name, level);
        this.setType(Type.GROUND);
        this.setStats(45, 100, 45, 45, 45, 10);
        this.setMove(new Rock_Slide(), new Double_Team());
    }
}
