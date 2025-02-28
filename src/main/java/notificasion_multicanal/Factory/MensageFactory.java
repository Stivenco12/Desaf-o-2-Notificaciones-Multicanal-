package notificasion_multicanal.Factory;

import notificasion_multicanal.Mensage;
import java.util.logging.Logger;

public abstract class MensageFactory {
    public abstract Mensage<Logger> CreateMensage();
}
