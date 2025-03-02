package notificasion_multicanal.menu;

import java.util.Scanner;

import notificasion_multicanal.Mensage;
import notificasion_multicanal.Factory.WhatsappFactory;

public class case3Menu {
    public static int case3() {
        try (Scanner sc = new Scanner(System.in)) { 
            int case3 = 0;
            Mensage WhatsApp = new WhatsappFactory().CreateMensage();
            WhatsApp.sendMessage();
            WhatsApp.logMessage();
            return case3;
        }        
    }
}
