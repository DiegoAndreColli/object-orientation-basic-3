package object.orientation.basic;

/**
 *
 * @author User
 */
public abstract class Employee {

    private Integer id;
    private String name;
    protected Double salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public abstract Double getBonus();

}
