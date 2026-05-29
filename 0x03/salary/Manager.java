public class Manager extends Employee {

    // Constructor
    public Manager(double fixedSalary) {
        super(fixedSalary);
    }

    // Override Employee bonus calculation
    @Override
    public double calculateBonus(Department department) {

        // If target reached
        if (department.reachedTarget()) {

            double baseBonus = getFixedSalary() * 0.20;

            double difference =
                    department.getAchievedTargetValue()
                    - department.getTargetValue();

            double extraBonus = difference * 0.01;

            return baseBonus + extraBonus;
        }

        return 0;
    }
}
