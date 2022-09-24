package serviceMenu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import serviceMenu.inter.MenuAddTeacherServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {

    @Override
    public void processAbstract() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add name: ");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Add surname: ");
        String surname = sc2.nextLine();

        Teacher t = new Teacher();
        t.setName(name);
        t.setSurname(surname);

        Config.instance().appendTeacher(t);

        System.out.println("Teacher Added");


    }
}
