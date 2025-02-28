package notificasion_multicanal.Factory;

import java.util.logging.Logger;
import notificasion_multicanal.Mensage;
import notificasion_multicanal.Models.SLACK;

public class SlackFactory extends MensageFactory{

    @Override
    public Mensage<Logger> CreateMensage() {
        return new SLACK();
    }

}
