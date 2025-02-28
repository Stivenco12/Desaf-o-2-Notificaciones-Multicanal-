package notificasion_multicanal.Models;

import java.util.logging.Logger;

import notificasion_multicanal.Mensage;

public class TELEGRAM implements Mensage<Logger>{

   
    @Override
    public void sendMessage() {
        String mensaje = "hola telegram";
        System.out.println("Enviando mensaje: " + mensaje);
    }

    @Override
    public Logger logMessage() {
        Logger logger = Logger.getLogger("MyLog");
        logger.info("Mensaje enviado a Slack");
        return logger;
    }

}
