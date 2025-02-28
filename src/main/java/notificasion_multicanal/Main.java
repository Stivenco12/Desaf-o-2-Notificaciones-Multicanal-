package notificasion_multicanal;

import notificasion_multicanal.Factory.SlackFactory;

public class Main {
    public static void main(String[] args) {
        Mensage slack = new SlackFactory().CreateMensage();
        slack.sendMessage();
        slack.logMessage();
    }
}