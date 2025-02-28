package notificasion_multicanal;

import java.util.logging.Logger;

public interface Mensage<logger> {
    void sendMessage();
    Logger logMessage();
}
