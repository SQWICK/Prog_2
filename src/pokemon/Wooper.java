package pokemon;
import attacks.sp.Mud_Shot;
import attacks.sp.Water_Gun;
import attacks.st.Rest;
import ru.ifmo.se.pokemon.*;

public class Wooper extends Pokemon {

    public Wooper(String name, int level){
      super(name, level);
      this.setType(Type.GROUND, Type.WATER);
      this.setStats(55,45,45,25,25,15);
      this.setMove(new Water_Gun(), new Mud_Shot(), new Rest());
    }
}
