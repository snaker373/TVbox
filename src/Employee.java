public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

    public void sethourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Base salary must be greater than zero");
        }
        this.baseSalary = baseSalary;
    }
    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}
