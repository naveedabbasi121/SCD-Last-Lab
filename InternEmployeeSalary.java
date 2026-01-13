public class InternEmployeeSalary implements SalaryCalculator {
    @Override
    public double calculateSalary(Employee employee) {
        // Returns base salary with no allowance [cite: 205]
        return employee.getBaseSalary();
    }
}