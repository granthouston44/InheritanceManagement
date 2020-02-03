package staff;

public abstract class Employee {

    private String name;
    private String ni;
    private double salary;

    public Employee(String name, String ni, double salary){
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals(""));
        else{this.name = name;}

    }

    public String getNi() {
        return ni;
    }

    public void setNi(String ni) {
        this.ni = ni;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double incrementValue){
        if(incrementValue > 0) {
            double result = this.salary * incrementValue;

            this.salary += result;
        }
        else{this.salary += 0;}
    }

    public void payBonus(){
        double bonus = this.salary * 0.01;
        this.salary += bonus;
    }

}
