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


public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "Developer", 9000);
        Employee employee1 = new Employee("Harry", "Director", 5000);
        Employee employee2 = new Employee("Linda", "Product-manager", 8000);

        HRManager hrManager = new HRManager();

        hrManager.hire(employee);
        hrManager.hire(employee1);
        hrManager.hire(employee2);

        hrManager.raiseSalary(employee, 3000);
        hrManager.raiseSalary(employee1, 3000);
        hrManager.raiseSalary(employee2, 3000);

        hrManager.hire(employee);

        hrManager.fire(employee1);

        hrManager.fire(employee1);
    }
}