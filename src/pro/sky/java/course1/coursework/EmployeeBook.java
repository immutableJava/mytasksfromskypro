package pro.sky.java.course1.coursework;

public class EmployeeBook {
    private static final Employee[] employees = new Employee[10];


    public String getInfoAboutEmployees() {
        StringBuilder info = new StringBuilder();
        for (Employee employee : employees) {
            info.append(employee.toString());
            info.append("\n");
        }
        return info.toString();
    }

    public double calculateSalary() {
        double result = 0;
        for (Employee employee : employees) {
            result += employee.getSalary();
        }
        return result;
    }

    public Employee findEmpWithMinSalary() {
        int indexOfMinSalary = 0;
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() < employees[0].getSalary()) {
                indexOfMinSalary = i;
            }
        }
        return employees[indexOfMinSalary];
    }

    public Employee findEmpWithMaxSalary() {
        int indexOfMaxSalary = 0;
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalary() > employees[indexOfMaxSalary].getSalary()) {
                indexOfMaxSalary = i;
            }
        }
        return employees[indexOfMaxSalary];
    }

    public double calculateAverageSalary() {
        return calculateSalary() / employees.length;
    }

    public void getFullNameOfEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }

    public void increaseSalary(double percent) {
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * percent);
        }
    }

    public Employee findEmpWithMinSalaryInCurrentDepartment(int department) {
        int indexOfMinSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                indexOfMinSalary = i;
                break;
            }
        }
        if (indexOfMinSalary == employees.length - 1)
            return employees[indexOfMinSalary];
        for (int i = indexOfMinSalary + 1; i < employees.length; i++) {
            if (employees[i].getSalary() < employees[indexOfMinSalary].getSalary() && employees[i].getDepartment() == department) {
                indexOfMinSalary = i;
            }
        }
        return employees[indexOfMinSalary];
    }

    public Employee findEmpWithMaxSalaryInCurrentDepartment(int department) {
        int indexOfMaxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                indexOfMaxSalary = i;
                break;
            }
        }
        if (indexOfMaxSalary == employees.length - 1)
            return employees[indexOfMaxSalary];
        for (int i = indexOfMaxSalary + 1; i < employees.length; i++) {
            if (employees[i].getSalary() > employees[indexOfMaxSalary].getSalary() && employees[i].getDepartment() == department) {
                indexOfMaxSalary = i;
            }
        }
        return employees[indexOfMaxSalary];
    }

    public double calculateSalaryInCurrentDepartment(int department) {
        double result = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                result += employee.getSalary();
            }
        }
        return result;
    }

    public void increaseSalaryInCurrentDepartment(int department, double percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() * percent);
            }
        }
    }

    public void outputInfoAboutEmpInCurrentDepartment(int department) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println("Employee{" +
                        "fullName='" + employee.getFullName() + '\'' +
                        ", salary=" + employee.getSalary() +
                        ", id=" + employee.getId() +
                        '}');
            }
        }
    }

    public void findEmpWithSalaryLessThanCurrent(double currentSalary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < currentSalary) {
                System.out.println("Employee{" +
                        ", id=" + employee.getId() +
                        "fullName='" + employee.getFullName() + '\'' +
                        ", salary=" + employee.getSalary() +
                        '}');
            }
        }
    }

    public void findEmpWithSalaryGreaterThanOrEqualToCurrent(double currentSalary) {
        for (Employee employee : employees) {
            if (employee.getSalary() >= currentSalary) {
                System.out.println("Employee{" +
                        ", id=" + employee.getId() +
                        "fullName='" + employee.getFullName() + '\'' +
                        ", salary=" + employee.getSalary() +
                        '}');
            }
        }
    }

    public void addNewEmployee(String fullName, double salary, int department) {
        Employee newEmployee = new Employee(fullName, salary, department);
        for (Employee employee : employees) {
            if (employee == null) {
                employee = newEmployee;
            }
        }
    }

    public void deleteEmployee(String fullName, int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id && employee.getFullName().equals(fullName))
                employee = null;
        }
    }

    public void changeSalary(String fullName, double salary) {
        for (Employee employee : employees) {
            if (employee.getFullName().equals(fullName)) {
                employee.setSalary(salary);
            }
        }
    }

    public void changeDepartment(String fullName, double department) {
        if (department < 1 && department > 5) {
            System.out.println("Данного отдела не существует.");
        }
        for (Employee employee : employees) {
            if (employee.getFullName().equals(fullName)) {
                employee.setSalary(department);
            }
        }
    }

    public void getFullNameOfEmpInDepartments() {
        StringBuilder result = new StringBuilder();
        for (int department = 1; department < 6; department++) {
            result.append(department).append(":");
            result.append("\n");
            for (Employee employee : employees) {
                if (employee.getDepartment() == department) {
                    result.append("   ").append(employee.getFullName()).append("\n");
                }
            }
        }
        System.out.println(result);
    }

}