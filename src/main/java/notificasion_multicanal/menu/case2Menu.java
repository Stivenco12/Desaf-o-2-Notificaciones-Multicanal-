package notificasion_multicanal.menu;

import java.util.Scanner;

import notificasion_multicanal.Mensage;
import notificasion_multicanal.Factory.TelegramFactory;

public class case2Menu {
    public static void case2() {
        try (Scanner sc = new Scanner(System.in)) { 
            Mensage Telegram = new TelegramFactory().CreateMensage();
            Telegram.sendMessage();
            Telegram.logMessage();
        }        
    }
}
