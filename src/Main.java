
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculatePay() {
        return 0.0;
    }
}

class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked; // Weekly pay
    }
}

public class Main{
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Elaki", 500000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Kannu", 15.0, 40.0);

        System.out.println("Salaried Employee: " + salariedEmployee.getName());
        System.out.println("Monthly Salary: $" + salariedEmployee.calculatePay());

        System.out.println("\nHourly Employee: " + hourlyEmployee.getName());
        System.out.println("Weekly Pay: $" + hourlyEmployee.calculatePay());
    }
}
