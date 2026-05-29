public class Department {

    private double targetValue;
    private double achievedTargetValue;

    // Constructor
    public Department(double targetValue, double achievedTargetValue) {
        this.targetValue = targetValue;
        this.achievedTargetValue = achievedTargetValue;
    }

    // Getters
    public double getTargetValue() {
        return targetValue;
    }

    public double getAchievedTargetValue() {
        return achievedTargetValue;
    }

    // Check if target was reached
    public boolean reachedTarget() {
        return achievedTargetValue >= targetValue;
    }
}
