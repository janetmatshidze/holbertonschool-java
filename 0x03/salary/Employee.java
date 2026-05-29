public class Employee {

    private double fixedSalary;

    // Constructor
    public Employee(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    // Getter
    public double getFixedSalary() {
        return fixedSalary;
    }

    // Calculate employee bonus
    public double calculateBonus(Department department) {

        // If target reached -> 10% bonus
        if (department.reachedTarget()) {
            return fixedSalary * 0.10;
        }

        // No bonus
        return 0;
    }

    // Fixed salary + bonus
    public double calculateTotalSalary(Department department) {
        return fixedSalary + calculateBonus(department);
    }
}
