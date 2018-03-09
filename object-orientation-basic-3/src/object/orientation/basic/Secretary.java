package object.orientation.basic;

/**
 *
 * @author User
 */
public class Secretary extends Employee {

    @Override
    public Double getBonus() {
        return this.salary * 0.15;
    }

}
