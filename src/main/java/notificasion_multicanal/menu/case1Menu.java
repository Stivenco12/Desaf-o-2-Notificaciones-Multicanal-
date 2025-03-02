package notificasion_multicanal.menu;

import java.util.Scanner;
import notificasion_multicanal.Mensage;
import notificasion_multicanal.Factory.SlackFactory;

public class case1Menu {
    public static int case1() {
        try (Scanner sc = new Scanner(System.in)) { 
            int case1 = 0;
            Mensage Slack = new SlackFactory().CreateMensage();
            Slack.sendMessage();
            Slack.logMessage();
            return case1;
        }        
    }
}
  

