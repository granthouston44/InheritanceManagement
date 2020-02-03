package staff;

public abstract class Employee {

    private String name;
    private String ni;
    private int salary;

    public Employee(String name, String ni, int salary){
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNi() {
        return ni;
    }

    public void setNi(String ni) {
        this.ni = ni;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double incrementValue){
        double result = this.salary * incrementValue;
        this.salary += result;
    }

    public void payBonus(){
        double bonus = this.salary * 0.01;
        this.salary += bonus;
    }

}
