import java.util.Arrays;
import java.util.Objects;

public class Main {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Ivan Ivanov", 1, 2000.0);
        employees[1] = new Employee("Ivan Ivanov", 2, 4000.0);
        employees[2] = new Employee("Ivan Ivanov", 3, 6000.0);
        employees[3] = new Employee("Ivan Ivanov", 4, 8000.0);
        employees[4] = new Employee("Ivan Ivanov", 5, 10000.0);
        employees[6] = new Employee("Ivan Ivanov", 1, 7000.0);
        employees[7] = new Employee(null, 1, 5000.0);
        System.out.println(getAndCalculateAverageSalary());
    }

    public static void printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getAndCalculateSalarySum() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeMinSalary(){
        double minSalary = -1;
        Employee minSalaryEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                minSalary = employees[i].getSalary();
                minSalaryEmpl = employees[i];
                index = i;
                break;
            }
        }

        if(minSalaryEmpl == null) return null;

        for (int i = index; i < employees.length; i++) {
            if (employees[i]!= null) {
                if (minSalary > employees[i].getSalary()) {
                    minSalary = employees[i].getSalary();
                    minSalaryEmpl = employees[i];

                }
            }
         }
        return minSalaryEmpl;
    }

    public static Employee getEmployeeMaxSalary() {
        double maxSalary = -1;
        Employee maxSalaryEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmpl = employees[i];
                index = i;
                break;
            }
        }

        if (maxSalaryEmpl == null) return null;

        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmpl = employees[i];

                }
            }
        }
        return maxSalaryEmpl;
    }

    public static double getAndCalculateAverageSalary(){
        double sumSalaryAllEmpl = getAndCalculateSalarySum();
        if (employees.length != 0) {
            return sumSalaryAllEmpl / employees.length;
        } else {
            return 0;
        }
    }
}