package serviceMenu;

import bean.Config;
import bean.Teacher;
import serviceMenu.inter.MenuAddTeacherServiceInter;
import serviceMenu.inter.MenuShowTeacherServiceInter;

public class MenuShowTeacherService implements MenuShowTeacherServiceInter {
    @Override
    public void processAbstract() {
        Teacher[] allTeachers= Config.instance().getTeachers();
        for (int i = 0; i <allTeachers.length ; i++) {
            System.out.println(allTeachers[i]);

        }
    }
}
