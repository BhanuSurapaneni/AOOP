package aoop5b1;


public class SRPDemo {
    public static void main(String[] args) {
        // Create instances of Employee
        Employee emp1 = new Employee("Alice", "Manager");
        Employee emp2 = new Employee("Bob", "Developer");
        Employee emp3 = new Employee("Charlie", "Intern");

        // Create a SalaryCalculator instance
        SalaryCalculator calculator = new SalaryCalculator();

        // Calculate and display salaries
        System.out.println(emp1.getName() + "'s Salary: $" + calculator.calculateSalary(emp1));
        System.out.println(emp2.getName() + "'s Salary: $" + calculator.calculateSalary(emp2));
        System.out.println(emp3.getName() + "'s Salary: $" + calculator.calculateSalary(emp3));
    }
}

