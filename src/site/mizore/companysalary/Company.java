package site.mizore.companysalary;

import java.util.Arrays;

public class Company {
    private double salaries;
    private Employee[] employee;
    Company(Employee[] employee) {
        this.employee= Arrays.copyOf(employee,employee.length);
    }
    public double salaryPay() {
        salaries=0;
        for (Employee value : employee) {
            salaries += value.earnings();
        }
        return salaries;
    }
}
