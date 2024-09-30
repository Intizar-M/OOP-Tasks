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

import java.util.ArrayList;
import java.util.List;

public class HRManager {
    private List<Employee> employees = new ArrayList<>();
    private List<String> employeeNames = new ArrayList<>();

    public void hire(Employee employee) {
        if(!employeeNames.contains(employee.getName())) {
            employees.add(employee);
            employeeNames.add(employee.getName());
            System.out.println("New employee: " + employee.getName());
        } else {
            System.out.println(employee.getName() + " is already hired.");
        }
    }

    public void fire(Employee employee) {
        if (employeeNames.contains(employee.getName())) {
            int index = employeeNames.indexOf(employee.getName());
            employees.remove(index);
            employeeNames.remove(index);
            System.out.println(employee.getName() + " employee fired.");
        } else {
            System.out.println(employee.getName() + " employee not found.");
        }
    }

    public void raiseSalary(Employee employee, double amount) {
        if(employeeNames.contains(employee.getName())){ //сделать не employees а обратиться по имени листа name list
            int index = employeeNames.indexOf(employee.getName());
            Employee emp = employees.get(index);
            emp.setSalary(emp.getSalary() + amount);
            System.out.println(employee.getName() + " salary raised " + employee.getSalary());
        } else {
            System.out.println(employee.getName() + " employee not found.");
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }


    public List<String> getEmployeeNames() {
        return employeeNames;
    }

    public List<Employee> setEmployeeNames(List<String> employeeNames) {
        this.employeeNames = employeeNames;
        return null;
    }
}
