package org.katheer.bean;

import java.util.Iterator;
import java.util.Map;

public class EmployeeDb {
    private Map<String, Employee> employees;

    public Map<String, Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Map<String, Employee> employees) {
        this.employees = employees;
    }

    public void getAllEmployees() {
        System.out.println(String.format("%-15s%-15s%-15s%-15s",
                "Name", "ID", "Dept", "Salary"));
        Iterator<Employee> itr = employees.values().iterator();

        while (itr.hasNext()) {
            itr.next().getEmployeeDetails();
        }
        System.out.println();
    }

    public void getEmployeeById(String id) {
        System.out.println(String.format("%-15s%-15s%-15s%-15s",
                "Name", "ID", "Dept", "Salary"));
        employees.get(id).getEmployeeDetails();
        System.out.println();
    }
}
