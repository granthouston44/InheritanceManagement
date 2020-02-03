package staff.management;

import staff.Employee;


public class Manager extends Employee {

    private String deptName;


    public Manager(String name, String ni, int salary){
        super(name, ni, salary);
        deptName = new String();
    }


    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
