package aoop5b1;

public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        // Simple salary calculation logic based on role
        switch (employee.getRole()) {
            case "Manager":
                return 80000;
            case "Developer":
                return 60000;
            case "Intern":
                return 30000;
            default:
                return 40000; // Default salary for other roles
        }
    }
}
