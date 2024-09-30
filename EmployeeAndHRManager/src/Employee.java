//6. Система управления персоналом (Employee и HRManager):
//
//Employee:
//Поля: name (String), position (String), salary (double).
//HRManager:
//Методы:
//hire(Employee employee): нанимает нового сотрудника.
//fire(Employee employee): увольняет сотрудника.
//raiseSalary(Employee employee, double amount): повышает зарплату сотрудника.
//Дополнительно: Реализуйте систему оценки производительности сотрудников.

public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        setName(name);
        setPosition(position);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
