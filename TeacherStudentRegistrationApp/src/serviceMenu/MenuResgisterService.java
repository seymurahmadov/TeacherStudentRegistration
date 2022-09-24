package serviceMenu;

import serviceMenu.inter.MenuRegisterServiceInter;
import serviceMenu.inter.MenuService;

public class MenuResgisterService implements MenuRegisterServiceInter {
    @Override
    public void processAbstract() {
        System.out.println("Register");
    }
}
