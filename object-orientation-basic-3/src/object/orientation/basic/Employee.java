package object.orientation.basic;

/**
 *
 * @author User
 */
public abstract class Employee {

    protected String name;
    protected Double salary;

    public Employee(String name) {
        this.name = name;
        this.salary = 0.0;
    }

    public String getName() {
        return name;
    }

    public void receivePayment(Double payment) {
        this.salary = payment;
        this.salary += getBonus();
    }

    public Double getSalary() {
        return salary;
    }

    public abstract Double getBonus();

}
