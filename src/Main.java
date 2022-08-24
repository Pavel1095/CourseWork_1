import java.util.Arrays;
import java.util.Objects;

public class Main {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Ivan Ivanov", 1, 5000.0);
        employees[1] = new Employee("Ivan Ivanov", 1, 5000.0);
        employees[2] = new Employee("Ivan Ivanov", 1, 5000.0);
        employees[3] = new Employee("Ivan Ivanov", 1, 5000.0);
        employees[4] = new Employee("Ivan Ivanov", 1, 5000.0);
        employees[5] = new Employee("Ivan Ivanov", 1, 5000.0);
        getAndCalculateSalarySum();
    }

    public static void printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getAndCalculateSalarySum() {
        double sum;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeMinSallary(){
        double minSallary = employees[0].getSalary();
    }
}