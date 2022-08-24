public class Employee {

    private int id;
    private String fullname;
    private int department;
    private double salary;
    private int counter;

    public Employee(String fullname, int department, double salary) {
        this.fullname = fullname;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id = " + id +
                ", fullname = '" + fullname + '\'' +
                ", department = " + department +
                ", salary = " + salary;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
