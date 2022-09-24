package serviceMenu;

import bean.Config;
import bean.Student;
import serviceMenu.inter.MenuShowStudentServiceInter;

public class MenuShowStudentService implements MenuShowStudentServiceInter {
    @Override
    public void processAbstract() {
        Student[] allStudents= Config.instance().getStudents();
        for (int i = 0; i < allStudents.length ; i++) {
            System.out.println(allStudents[i]);
            
        }
    }
}
