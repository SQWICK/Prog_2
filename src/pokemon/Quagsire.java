package pokemon;
import attacks.sp.Focus_Blast;
import attacks.sp.Mud_Shot;
import attacks.sp.Water_Gun;
import attacks.st.Rest;
import ru.ifmo.se.pokemon.*;

public class Quagsire extends Pokemon {

    public Quagsire(String name, int level) {
        super(name, level);
        this.setType(Type.GROUND, Type.WATER);
        this.setStats(95, 85, 85, 65, 65, 35);
        this.setMove(new Water_Gun(), new Mud_Shot(), new Rest(), new Focus_Blast());
    }
}
