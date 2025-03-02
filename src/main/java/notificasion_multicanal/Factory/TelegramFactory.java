package notificasion_multicanal.Factory;

import java.util.logging.Logger;

import notificasion_multicanal.Mensage;
import notificasion_multicanal.Models.TELEGRAM;

public class TelegramFactory extends MensageFactory {

    @Override
    public Mensage<Logger> CreateMensage() {
        return new TELEGRAM();
    }

}
