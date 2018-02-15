package object.orientation.basic;

/**
 *
 * @author User
 */
public abstract class Employee {

    protected String name;
    protected Double salary;
    protected Double remuneration;

    public Employee(String name) {
        this.name = name;
        this.salary = 0.0;
        this.remuneration = 0.0;
    }

    public String getName() {
        return name;
    }

    public void receivePayment(Double payment) {
        this.salary = payment;
    }

    public void sumTotalRemuneration() {
        this.remuneration = this.salary + getBonus();
    }

    public Double getRemuneration() {
        return remuneration;
    }

    public abstract Double getBonus();

}
