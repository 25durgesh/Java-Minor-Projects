public class FullTimeEmployee extends Employee {
    private double hra;
    private double da;

    public FullTimeEmployee(int empId, String name, double basicSalary) {
        super(empId, name, basicSalary);
        hra = basicSalary * 0.20;
        da = basicSalary * 0.10;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + hra + da;
    }
}
