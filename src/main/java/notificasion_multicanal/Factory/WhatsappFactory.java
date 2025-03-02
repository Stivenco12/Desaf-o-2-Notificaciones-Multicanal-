package notificasion_multicanal.Factory;

import java.util.logging.Logger;

import notificasion_multicanal.Mensage;
import notificasion_multicanal.Models.WHATSAPP;

public class WhatsappFactory extends MensageFactory{

    @Override
    public Mensage<Logger> CreateMensage() {
        return new WHATSAPP();
    }

}
