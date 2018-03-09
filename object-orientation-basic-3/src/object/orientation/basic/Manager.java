package object.orientation.basic;

import java.util.List;

/**
 *
 * @author User
 */
public class Manager extends Employee {

    private String creditCard;
    private List<Employee> employees;

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void hire(Employee employee) {
        this.employees.add(employee);
    }

    public void fire(Employee employee) {
        this.employees.remove(employee);
    }

    @Override
    public Double getBonus() {
        return this.salary  * 0.1 + 1000;
    }
}
