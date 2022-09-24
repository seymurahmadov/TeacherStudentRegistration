package serviceMenu;

import bean.Config;
import bean.Student;
import serviceMenu.inter.MenuAddStudentServiceInter;
import util.FileUtility;

import java.util.Scanner;

public class MenuAddStudentService implements MenuAddStudentServiceInter {
    @Override
    public void processAbstract() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add name: ");
        String name = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Add surname: ");
        String surname = sc2.nextLine();

        Student s = new Student();
        s.setName(name);
        s.setSurname(surname);

        Config.instance().appendStudent(s);

        System.out.println("Student Added");






    }
}
