package serviceMenu;

import bean.Config;
import serviceMenu.inter.MenuLoginServiceInter;
import serviceMenu.inter.MenuService;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void processAbstract() {
        Scanner sc = new Scanner(System.in);
        System.out.println("username:");
        String username = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("password:");
        String passWord = sc2.nextLine();

        if ( !(username.equals("user") && passWord.equals("11111")) ){
            throw new IllegalArgumentException("User or password is invalid");

        }

        Config.setLoggedIn(true);


    }
}
