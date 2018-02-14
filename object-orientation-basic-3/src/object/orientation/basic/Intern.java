package object.orientation.basic;

/**
 *
 * @author User
 */
public class Intern extends Employee{

    public Intern(String name) {
        super(name);
    }

    @Override
    public Double getBonus() {
        return this.salary * 0.05;
    }

}
