package notificasion_multicanal;

import java.util.Scanner;
import notificasion_multicanal.menu.InformacionMenu;
import notificasion_multicanal.menu.case1Menu;
import notificasion_multicanal.menu.case2Menu;
import notificasion_multicanal.menu.case3Menu;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {   
            InformacionMenu.Informationmenu();
            String menu0;
            menu0 = sc.nextLine();
            switch (menu0) {
                case "1":
                    case1Menu.case1();
                    break;
                case "2":
                    case2Menu.case2();
                    break;
                case "3":
                    case3Menu.case3();
                    break;
                case "4":
                    System.out.println("saliendo......");
                    break;
                }
        }
    }
}