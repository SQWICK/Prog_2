package pokemon;
import attacks.ph.Facade;
import attacks.ph.Steel_Wing;
import attacks.sp.Charge_Beam;
import attacks.st.Roost;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zapdos extends Pokemon {

    public Zapdos(String name, int level){
        super(name, level);
        this.setType(Type.ELECTRIC, Type.FLYING);
        this.setStats(90,90,85,125,90,100);
        this.setMove(new Steel_Wing(), new Roost(), new Facade(), new Charge_Beam());
    }
}
