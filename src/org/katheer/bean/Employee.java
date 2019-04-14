package org.katheer.bean;

public class Employee {
    private String empid;
    private String name;
    private String dept;
    private String salary;

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void getEmployeeDetails() {
        System.out.println(String.format("%-15s%-15s%-15s%-15s",
                this.getName(), this.getEmpid(), this.getDept(), this.getSalary()));
    }
}
