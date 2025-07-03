public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(10);
        employee.sethourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}