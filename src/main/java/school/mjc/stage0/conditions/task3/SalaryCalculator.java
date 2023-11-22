package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double afterTaxes;
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            afterTaxes = salary - salary * 0.15;
            System.out.println(afterTaxes);
        } else if (salary <= 20000) {
            afterTaxes = salary - salary * 0.18;
            System.out.println(afterTaxes);
        } else {
            afterTaxes = salary - salary * 0.20;
            System.out.println(afterTaxes);
        }
    }
}
