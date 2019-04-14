package org.katheer.test;

import org.katheer.bean.EmployeeDb;
import org.katheer.bean.Library;
import org.katheer.bean.Passbook;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/katheer/resource/applicationContext.xml");

        System.out.println("******List Example******");
        Passbook p1 = (Passbook) context.getBean("passbook1");
        System.out.println(p1.getTransactions().getClass());
        p1.showAccountDetails();
        System.out.println();

        System.out.println("******Set Example******");
        Library library = (Library) context.getBean("library");
        System.out.println(library.getBooks().getClass());
        library.showBooks();
        System.out.println();

        System.out.println("******Map Example******");
        EmployeeDb employeeDb = (EmployeeDb) context.getBean("employeedb");
        System.out.println(employeeDb.getEmployees().getClass());
        employeeDb.getAllEmployees();
        employeeDb.getEmployeeById("E102");
        employeeDb.getEmployeeById("E103");
        System.out.println();
    }
}
